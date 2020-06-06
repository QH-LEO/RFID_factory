package com.example.demo.dao.mapper;

import com.example.demo.pojo.GoodsColor;
import com.example.demo.pojo.GoodsType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Repository
public interface GoodsTypeMapper {

    GoodsType FindByTypeID(@Param("id") String id);

}
