package com.example.demo.controller;

import com.example.demo.dao.redis.RedisUtil;
import com.example.demo.pojo.Grpc.ReadEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shipengfei
 * @data 19-12-10
 */
@RequestMapping("/redis")
@RestController
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisset(){

        String uuid="123456";
        int num=10;
        List<String> rfids=new ArrayList<>();

        rfids.add("1");
        rfids.add("2");
        rfids.add("3");
        rfids.add("4");
        rfids.add("5");
        rfids.add("6");
        rfids.add("7");
        rfids.add("8");
        rfids.add("9");
        rfids.add("10");


        ReadEntity entity=new ReadEntity();
        entity.setUuid(uuid);
        entity.setRfids(rfids);
        entity.setNum(num);

        return redisUtil.set(uuid,entity,ExpireTime);
    }

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }

    @RequestMapping("getExpire")
    public long getExpire(String key){
        return redisUtil.getExpire(key);
    }
}
