package com.ld.store.dao;

import com.ld.store.entity.Outstoregoodsinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface OutstoregoodsinfoMapper {
    int insert(Outstoregoodsinfo record);

    int insertSelective(Outstoregoodsinfo record);

    int batchInsert(@Param("list") List<Outstoregoodsinfo> list);
}