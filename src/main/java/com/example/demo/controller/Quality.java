package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.controller.long_connection.hello_demo.Greeting;
import com.example.demo.controller.long_connection.hello_demo.HelloMessage;
import com.example.demo.grpc.GrpcClient;
import com.example.demo.pojo.Data;
import com.example.demo.pojo.GoodsInfo;
import com.example.demo.server.GoodsColorServer;
import com.example.demo.server.GoodsInfoServer;
import com.example.demo.server.TailorInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.io.IOException;
import java.util.UUID;

/**
 * @author shipengfei
 * @data 19-10-27
 */

@RestController
public class Quality {

    @Autowired
    private GoodsColorServer goodsColorServer;

    @Autowired
    private TailorInfoServer tailorInfoServer;

    @Autowired
    private GoodsInfoServer goodsInfoServer;


    private static final String DEFAULT_HOST = "localhost";
    private static final int DEFAULT_PORT = 8088;

    private static final GrpcClient client=new GrpcClient(DEFAULT_HOST,DEFAULT_PORT);

    //质检-合格品
    @RequestMapping(value = "qualified/submit",method = RequestMethod.POST)
    public String qualified(@RequestBody JSONObject json) throws IOException {

        Data d= JSON.parseObject(json.toString(), Data.class);
        String type=d.getTypeName();
        String size=d.getSizeName();
        String style=d.getStyleName();
        String color=d.getColorName();
        String status=d.getStatus();



        String state="t";

        return "";
    }

    //质检-残次品
    @RequestMapping(value = "unqualified/submit",method = RequestMethod.POST)
    public String unqualified(@RequestBody JSONObject json) throws IOException {

        Data d= JSON.parseObject(json.toString(), Data.class);
        String id=d.getId();

        return "";
    }


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public Greeting destroy(@RequestBody HelloMessage message) throws IOException, InterruptedException {

        Thread.sleep(1000); // simulated delay
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");

        return new Greeting(uuid+"\t\t" + HtmlUtils.htmlEscape(message.getName()));

    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String trst() throws IOException {

        GoodsInfo goodsInfo=goodsInfoServer.FindByInfoRFID("123456");
        System.out.println(goodsInfo.toString());

        GoodsInfo goodsInfo1=new GoodsInfo();
        goodsInfo1.setRFID("123456");
        goodsInfo1.setStatus("5");
        goodsInfoServer.UpdateByInfoRFID(goodsInfo1);

        goodsInfo1=goodsInfoServer.FindByInfoRFID("123456");
        System.out.println(goodsInfo1.toString());


        return goodsInfo.toString()+"\\n"+goodsInfo1.toString();
    }

}
