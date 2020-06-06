package com.example.demo.server;

import com.example.demo.pojo.GoodsInventoryLog;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface GoodsInventoryLogServer {

    GoodsInventoryLog FindByInventoryLogID(String id);

}
