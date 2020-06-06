package com.example.demo.server.imp;

import com.example.demo.dao.mapper.GoodsInventoryLogMapper;
import com.example.demo.pojo.GoodsInventoryLog;
import com.example.demo.server.GoodsInventoryLogServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class GoodsInventoryLogServerImp implements GoodsInventoryLogServer {
    @Autowired
    private GoodsInventoryLogMapper goodsInventoryLogMapper;
    @Override
    public GoodsInventoryLog FindByInventoryLogID(String id) {
        return goodsInventoryLogMapper.FindByInventoryLogID(id);
    }
}
