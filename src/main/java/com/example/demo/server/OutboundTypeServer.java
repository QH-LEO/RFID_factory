package com.example.demo.server;

import com.example.demo.pojo.OutboundType;

/**
 * @author shipengfei
 * @data 19-11-4
 */
public interface OutboundTypeServer {

    OutboundType FindByOutboundTypeID( String id);

}
