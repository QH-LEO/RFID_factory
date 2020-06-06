package com.example.demo.dao.mapper;

import com.example.demo.pojo.GoodsQaLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Repository
public interface GoodsQaLogMapper {

    GoodsQaLog FindByQaLogID(@Param("id") String id);
    void AddQaLog(GoodsQaLog goodsQaLog);

}
