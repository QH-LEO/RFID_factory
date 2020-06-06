package com.example.demo.server;

import com.example.demo.pojo.TailorInfo;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface TailorInfoServer {

    TailorInfo FindByTailorID( String id);

}
