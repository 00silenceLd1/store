package com.ld.store.dao;

import com.ld.store.entity.Userinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface UserinfoMapper {
    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    int batchInsert(@Param("list") List<Userinfo> list);
}