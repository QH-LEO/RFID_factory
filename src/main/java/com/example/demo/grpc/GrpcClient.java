package com.example.demo.grpc;

//import com.example.demo.rfid.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.ClientCallStreamObserver;
import io.grpc.stub.ClientResponseObserver;
import rfid.Rfid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author shipengfei
 * @data 19-11-10
 */
public class GrpcClient {

    private static final String DEFAULT_HOST = "localhost";
    private static final int DEFAULT_PORT = 8088;

    private static final Logger logger = Logger.getLogger(GrpcClient.class.getName());

    private final ManagedChannel managedChannel;
    private final RFIDGrpc.RFIDStub rfidStub;

    public GrpcClient() {
        //使用明文通讯，这里简单化，实际生产环境需要通讯加密
        this(ManagedChannelBuilder.forAddress(DEFAULT_HOST,DEFAULT_PORT)
                .usePlaintext()
                .build());
    }

    public GrpcClient(String host, int port) {
        //使用明文通讯，这里简单化，实际生产环境需要通讯加密
        this(ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext()
                .build());
    }

    public GrpcClient(ManagedChannel managedChannel) {
        this.managedChannel=managedChannel;
        this.rfidStub = RFIDGrpc.newStub(managedChannel);
    }

    /**
     * 实际调用部分
     * @param nums 传到服务端的数据流
     */
    //init操作
    public void init( List<Integer> nums) throws InterruptedException {

        //判断调用状态。在内部类中被访问，需要加final修饰
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        ClientResponseObserver<Rfid.InitParam, Rfid.InitReply> responseObserver =
                new ClientResponseObserver<Rfid.InitParam, Rfid.InitReply>() {

                    ClientCallStreamObserver<Rfid.InitParam> initCallStreamObserver;

                    @Override
                    public void beforeStart(ClientCallStreamObserver<Rfid.InitParam> initCallStreamObserver) {
                        this.initCallStreamObserver = initCallStreamObserver;
                        initCallStreamObserver.disableAutoInboundFlowControl();

                        initCallStreamObserver.setOnReadyHandler(new Runnable() {

                            @Override
                            public void run() {
                                // Start generating values from where we left off on a non-gRPC thread.
                                while (initCallStreamObserver.isReady()) {

                                }
                            }
                        });
                    }

                    @Override
                    public void onNext(Rfid.InitReply value) {
                        logger.info("<-- " + value.toString());

                        value.getBaseInfo().getResultCode().getNumber();

                        // Signal the sender to send one message.
                        initCallStreamObserver.request(1);
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        countDownLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        logger.info("All Done");
                        countDownLatch.countDown();
                    }
                };

        rfidStub.init(responseObserver);
        countDownLatch.await();

        managedChannel.shutdown();
        managedChannel.awaitTermination(1, TimeUnit.SECONDS);

    }

    /**
     * read操作
     *
     * @param arrayBlockingQueue 用于传递接受到的消息到后台处理
     * @return 返回读取的RFID集合
     * @throws InterruptedException
     */
    public List<String> read(int num,ArrayBlockingQueue<String> arrayBlockingQueue) throws InterruptedException {

        //判断调用状态。在内部类中被访问，需要加final修饰
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        List<String> rfids=new ArrayList<>();
        ClientResponseObserver<Rfid.ReadParam, Rfid.ReadReply> responseObserver =
                new ClientResponseObserver<Rfid.ReadParam, Rfid.ReadReply>() {

                    @Override
                    public void beforeStart(ClientCallStreamObserver<Rfid.ReadParam> clientCallStreamObserver) {

                    }

                    ClientCallStreamObserver<Rfid.ReadParam> readCallStreamObserver;

                    //client客户端连接server服务器前进行的操作
                    //eg: 将参数传递给服务器
                    @Override
                    public void beforeStart(ClientCallStreamObserver<Rfid.ReadParam> readCallStreamObserver) {
                        this.readCallStreamObserver = readCallStreamObserver;
                        readCallStreamObserver.disableAutoInboundFlowControl();

                        readCallStreamObserver.setOnReadyHandler(new Runnable() {

                            @Override
                            public void run() {
                                // Start generating values from where we left off on a non-gRPC thread.
                                while (readCallStreamObserver.isReady()) {
                                    if (rfids.size()!=num){
                                        Rfid.ReadParam readParam= Rfid.ReadParam.getDefaultInstance();

                                        readCallStreamObserver.onNext(readParam);
                                    }else {
                                        readCallStreamObserver.onCompleted();
                                    }

                                }
                            }
                        });
                    }

                    //拿到一个数据后，进行相应的操作
                    @Override
                    public void onNext(Rfid.ReadReply value) {
                        logger.info("<-- " + value.toString());

                        value.getBaseInfo().getResultCode().getNumber();

                        //count:本次grpc读取到的数据量
                        int count= (int) value.getCount();
                        count--;
                        while (count>0){
                            //获取到消息体里的RFID码
                            String rfid=String.valueOf(value.getList(count).getId());
                            rfids.add(rfid);
                            System.out.println(rfid);
                            arrayBlockingQueue.add(rfid);
                            count--;
                        }

                        // Signal the sender to send one message.
                        readCallStreamObserver.request(1);
                    }

                    /**
                     * @param readReply
                     */
                    @Override
                    public void onNext(Rfid.ReadReply readReply) {

                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        countDownLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        logger.info("All Done");
                        countDownLatch.countDown();
                    }

                };

        rfidStub.read(responseObserver);
        countDownLatch.await();

        managedChannel.shutdown();
        managedChannel.awaitTermination(1, TimeUnit.SECONDS);


        return rfids;

    }



    /**
     * qualifiedSubimt操作 -> 质检合格时调用
     *
     * @throws InterruptedException
     */
    public void qualifiedSubimt(List<String> rfids,ArrayBlockingQueue<String> arrayBlockingQueue) throws InterruptedException {

        //判断调用状态。在内部类中被访问，需要加final修饰
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        ClientResponseObserver<Rfid.WriteParam, Rfid.WriteReply> responseObserver =
                new ClientResponseObserver<Rfid.WriteParam, Rfid.WriteReply>() {

                    ClientCallStreamObserver<Rfid.WriteParam> writeCallStreamObserver;

                    @Override
                    public void beforeStart(ClientCallStreamObserver<Rfid.WriteParam> writeCallStreamObserver) {
                        this.writeCallStreamObserver = writeCallStreamObserver;
                        writeCallStreamObserver.disableAutoInboundFlowControl();

                        writeCallStreamObserver.setOnReadyHandler(new Runnable() {

                            Iterator<String> iterator=rfids.iterator();

                            @Override
                            public void run() {
                                // Start generating values from where we left off on a non-gRPC thread.
                                while (writeCallStreamObserver.isReady()) {
                                    if (iterator.hasNext()){
                                        String rfid=iterator.next();



                                        Rfid.WriteParam writeParam=WriteParam.newBuilder().build();
                                        System.out.println(writeParam.toString());

                                        arrayBlockingQueue.add(rfid);

                                        writeCallStreamObserver.onNext(writeParam);
                                    }else {
                                        writeCallStreamObserver.onCompleted();
                                    }


                                }
                            }
                        });
                    }

                    @Override
                    public void onNext(WriteReply value) {
                        logger.info("<-- " + value.toString());

                        // Signal the sender to send one message.
                        writeCallStreamObserver.request(1);
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        countDownLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        logger.info("All Done");
                        countDownLatch.countDown();
                    }
                };

        rfidStub.write(responseObserver);
        countDownLatch.await();

        managedChannel.shutdown();
        managedChannel.awaitTermination(1, TimeUnit.SECONDS);

    }


}
