package com.example.demo.server.imp;

import com.example.demo.dao.mapper.GoodsTypeMapper;
import com.example.demo.pojo.GoodsType;
import com.example.demo.server.GoodsTypeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class GoodsTypeServerImp implements GoodsTypeServer {
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public GoodsType FindByTypeID(String id) {
        return goodsTypeMapper.FindByTypeID(id);
    }
}
