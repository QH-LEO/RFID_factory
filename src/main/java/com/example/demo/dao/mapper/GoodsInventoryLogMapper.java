package com.example.demo.dao.mapper;

import com.example.demo.pojo.GoodsInventoryLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Repository
public interface GoodsInventoryLogMapper {

    GoodsInventoryLog FindByInventoryLogID(@Param("id") String id);

}
