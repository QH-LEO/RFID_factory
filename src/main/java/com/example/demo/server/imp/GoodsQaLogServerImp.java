package com.example.demo.server.imp;

import com.example.demo.dao.mapper.GoodsQaLogMapper;
import com.example.demo.pojo.GoodsQaLog;
import com.example.demo.server.GoodsQaLogServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class GoodsQaLogServerImp implements GoodsQaLogServer {
    @Autowired
    private GoodsQaLogMapper goodsQaLogMapper;

    @Override
    public GoodsQaLog FindByQaLogID(String id) {
        return goodsQaLogMapper.FindByQaLogID(id);
    }

    @Override
    public void AddQaLog(GoodsQaLog goodsQaLog) {
        goodsQaLogMapper.AddQaLog(goodsQaLog);
    }
}
