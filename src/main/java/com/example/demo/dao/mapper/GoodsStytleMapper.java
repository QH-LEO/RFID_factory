package com.example.demo.dao.mapper;

import com.example.demo.pojo.GoodsStytle;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Repository
public interface GoodsStytleMapper {

    GoodsStytle FindByStytleID(@Param("id") String id);

}
