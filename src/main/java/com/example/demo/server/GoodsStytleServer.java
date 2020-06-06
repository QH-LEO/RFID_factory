package com.example.demo.server;

import com.example.demo.pojo.GoodsStytle;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface GoodsStytleServer {

    GoodsStytle FindByStytleID(String id);

}
