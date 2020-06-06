package com.example.demo.grpc.rfid_methods;

import com.example.demo.dao.redis.RedisUtil;
import com.example.demo.grpc.GrpcClient;
import com.example.demo.pojo.Grpc.ReadEntity;


import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author shipengfei
 * @data 19-12-2
 */
public class GrpcReading extends Thread{

    private static int ExpireTime = 300;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    private int num;
    private String uuid;
    private ArrayBlockingQueue<String> arrayBlockingQueue;

    public GrpcReading(){
    }

    public GrpcReading(int num,String uuid,ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.num=num;
        this.uuid = uuid;
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    public void reading() throws Exception {
        Thread.sleep(1000); // simulated delay

        GrpcClient grpcClient=new GrpcClient("localhost",8888);
        List<String> rfids=grpcClient.read(num,arrayBlockingQueue);
        int num=rfids.size();

        ReadEntity entity=new ReadEntity();
        entity.setUuid(uuid);
        entity.setRfids(rfids);
        entity.setNum(num);

        redisUtil.set(uuid,entity,ExpireTime);

    }

    public void run(){
        try {
            reading();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
