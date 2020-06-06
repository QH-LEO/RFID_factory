package com.example.demo.server.imp;

import com.example.demo.dao.mapper.GoodsSizeMapper;
import com.example.demo.pojo.GoodsSize;
import com.example.demo.server.GoodsSizeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class GoodsSizeServerImp implements GoodsSizeServer {
    @Autowired
    private GoodsSizeMapper goodsSizeMapper;

    @Override
    public GoodsSize FindBySizeID(String id) {
        return goodsSizeMapper.FindBySizeID(id);
    }
}
