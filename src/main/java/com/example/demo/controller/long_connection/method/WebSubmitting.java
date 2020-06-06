package com.example.demo.controller.long_connection.method;

import com.example.demo.controller.long_connection.read.Submitting;
import com.example.demo.pojo.GoodsInfo;
import com.example.demo.server.GoodsInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author shipengfei
 * @data 19-11-27
 */
@Component
public class WebSubmitting extends Thread{

    @Autowired
    private SimpMessagingTemplate template;

    private int num;
    private String[] attributes;
    private List<String> rfids;
    private ArrayBlockingQueue<String> arrayBlockingQueue;

    @Autowired
    private GoodsInfoServer goodsInfoServer;

    public WebSubmitting(){
    }

    public WebSubmitting(int num, String[] attributes, List<String> rfids, ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.num = num;
        this.attributes = attributes;
        this.rfids = rfids;
        this.arrayBlockingQueue = arrayBlockingQueue;
    }


    public void submitting() throws Exception {
        Thread.sleep(1000); // simulated delay

        Map<String,Integer> map=new HashMap<>();

        for (String attribute:attributes)
            map.put(attribute,0);

        //已读RFID数量
        int real=0;

        //当前读取情况
        String status="t";

        while (true){
            if (num==real)
                break;

            String rfid = arrayBlockingQueue.poll(1, TimeUnit.SECONDS);
            //从队列拿到已读的RFID
            //如果queue为null，那么5秒之后再去队列中取数据
            if (rfid!=null){
                //根据RFID数据库拿到对应数据
                GoodsInfo goodsInfo=goodsInfoServer.FindByInfoRFID(rfid);

                String attrs=goodsInfo.getFourAttributes();
                if(map.containsKey(attrs)){
                    int n=map.get(attrs);
                    map.put(attrs,n+1);
                    real++;
                    goodsInfo.setStatus("4");
                    goodsInfoServer.UpdateByInfoRFID(goodsInfo);
                }else{
                    //处理意料外情况，待定
                    status="f";
                }
            }

            template.convertAndSend("/topic/greetings",new Submitting(status,real));
        }

    }

    public void run(){
        try {
            submitting();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
