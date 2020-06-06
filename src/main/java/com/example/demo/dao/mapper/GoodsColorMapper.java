package com.example.demo.dao.mapper;

import com.example.demo.pojo.GoodsColor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Repository
public interface GoodsColorMapper {

    GoodsColor FindByColorID(@Param("id") String id);


}
