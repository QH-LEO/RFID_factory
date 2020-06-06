package com.example.demo.server;

import com.example.demo.pojo.GoodsQaLog;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface GoodsQaLogServer {

    GoodsQaLog FindByQaLogID(String id);

    void AddQaLog(GoodsQaLog goodsQaLog);

}
