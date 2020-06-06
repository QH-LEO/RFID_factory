package com.example.demo.server.imp;

import com.example.demo.dao.mapper.GoodsColorMapper;
import com.example.demo.pojo.GoodsColor;
import com.example.demo.server.GoodsColorServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class GoodsColorServerImp implements GoodsColorServer {

    @Autowired
    private GoodsColorMapper goodsColorMapper;

    @Override
    public GoodsColor FindByColorID(String id) {
        return goodsColorMapper.FindByColorID(id);
    }
}
