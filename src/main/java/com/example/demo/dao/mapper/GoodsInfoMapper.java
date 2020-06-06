package com.example.demo.dao.mapper;

import com.example.demo.pojo.GoodsInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Repository
public interface GoodsInfoMapper {
    GoodsInfo FindByInfoID(@Param("id") String id);
    GoodsInfo FindByInfoRFID(@Param("RFID")String rfid);
    void UpdateByInfoRFID( GoodsInfo goodsInfo);
}
