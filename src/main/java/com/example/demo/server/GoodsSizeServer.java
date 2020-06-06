package com.example.demo.server;

import com.example.demo.pojo.GoodsSize;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface GoodsSizeServer {

    GoodsSize FindBySizeID(String id);

}
