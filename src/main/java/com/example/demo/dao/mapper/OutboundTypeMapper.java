package com.example.demo.dao.mapper;


import com.example.demo.pojo.OutboundType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shipengfei
 * @data 19-11-4
 */
@Repository
public interface OutboundTypeMapper {

    OutboundType FindByOutboundTypeID(@Param("id") String id);

}
