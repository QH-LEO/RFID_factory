package com.example.demo.server.imp;

import com.example.demo.dao.mapper.TailorInfoMapper;
import com.example.demo.pojo.TailorInfo;
import com.example.demo.server.TailorInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Service
public class TailorInfoServerImp implements TailorInfoServer {
    @Autowired
    private TailorInfoMapper tailorInfoMapper;

    @Override
    public TailorInfo FindByTailorID(String id) {
        return tailorInfoMapper.FindByTailorID(id);
    }
}
