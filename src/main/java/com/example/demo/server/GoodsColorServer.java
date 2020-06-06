package com.example.demo.server;

import com.example.demo.pojo.GoodsColor;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface GoodsColorServer {

    GoodsColor FindByColorID(String id);

}
