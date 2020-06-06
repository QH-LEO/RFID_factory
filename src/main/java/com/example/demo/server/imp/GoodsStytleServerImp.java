package com.example.demo.server.imp;

import com.example.demo.dao.mapper.GoodsStytleMapper;
import com.example.demo.pojo.GoodsStytle;
import com.example.demo.server.GoodsStytleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class GoodsStytleServerImp implements GoodsStytleServer {
    @Autowired
    private GoodsStytleMapper goodsStytleMapper;

    @Override
    public GoodsStytle FindByStytleID(String id) {
        return goodsStytleMapper.FindByStytleID(id);
    }
}
