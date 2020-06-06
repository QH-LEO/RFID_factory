package com.example.demo.server.imp;

import com.example.demo.dao.mapper.GoodsInfoMapper;
import com.example.demo.pojo.GoodsInfo;
import com.example.demo.server.GoodsInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class GoodsInfoServerImp implements GoodsInfoServer {
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public GoodsInfo FindByInfoID(String id) {
        return goodsInfoMapper.FindByInfoID(id);
    }

    @Override
    public GoodsInfo FindByInfoRFID(String rfid) {
        return goodsInfoMapper.FindByInfoRFID(rfid);
    }

    @Override
    public void UpdateByInfoRFID(GoodsInfo goodsInfo) {
        goodsInfoMapper.UpdateByInfoRFID(goodsInfo);
    }
}
