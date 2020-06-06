package com.example.demo.server.imp;

import com.example.demo.dao.mapper.OutboundTypeMapper;
import com.example.demo.pojo.OutboundType;
import com.example.demo.server.OutboundTypeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class OutboundTypeServerImp implements OutboundTypeServer {
    @Autowired
    private OutboundTypeMapper outboundTypeMapper;

    @Override
    public OutboundType FindByOutboundTypeID(String id) {
        return outboundTypeMapper.FindByOutboundTypeID(id);
    }
}
