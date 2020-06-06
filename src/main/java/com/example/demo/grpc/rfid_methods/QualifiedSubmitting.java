package com.example.demo.grpc.rfid_methods;

import com.example.demo.dao.redis.RedisUtil;
import com.example.demo.grpc.GrpcClient;
import com.example.demo.pojo.GoodsInfo;
import com.example.demo.server.GoodsInfoServer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author shipengfei
 * @data 19-12-15
 */
public class QualifiedSubmitting {

    private static int ExpireTime = 300;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @Autowired
    private GoodsInfoServer goodsInfoServer;

    private String uuid;
    private ArrayBlockingQueue<String> arrayBlockingQueue;

    public QualifiedSubmitting(String uuid,ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.uuid = uuid;
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    public void submitting() throws InterruptedException {
        Thread.sleep(1000); // simulated delay

        GrpcClient grpcClient=new GrpcClient("localhost",8888);

        List<String> rfids= (List<String>) redisUtil.get(uuid);
        Iterator<String> iterator=rfids.iterator();

        while (iterator.hasNext()){
            String rfid=iterator.next();

            GoodsInfo goodsInfo=goodsInfoServer.FindByInfoRFID(rfid);

            String attr=goodsInfo.getFourAttributes();

            goodsInfo.setStatus("4");

        }

        grpcClient.qualifiedSubimt(rfids,arrayBlockingQueue);

    }

    public void run(){
        try {
            submitting();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
