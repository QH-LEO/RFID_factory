package com.example.demo.server;

import com.example.demo.pojo.GoodsInfo;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface GoodsInfoServer {

    GoodsInfo FindByInfoID(String id);

    GoodsInfo FindByInfoRFID(String rfid);

    void UpdateByInfoRFID(GoodsInfo goodsInfo);


}
