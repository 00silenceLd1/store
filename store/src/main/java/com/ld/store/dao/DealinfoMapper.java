package com.ld.store.dao;

import com.ld.store.entity.Dealinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface DealinfoMapper {
    int insert(Dealinfo record);

    int insertSelective(Dealinfo record);

    int batchInsert(@Param("list") List<Dealinfo> list);

    List<Dealinfo> queryAllByDealinfoid(@Param("dealinfoid")String dealinfoid);

    List<Dealinfo> queryByAll(@Param("dealNo")String dealNo,
                              @Param("dealPerson")String dealPerson,
                              @Param("startTime")Long startTime,
                              @Param("endTime")Long endTime,
                              @Param("startRow")int startRow,
                              @Param("pageSize")int pageSize);

    int updateByDealinfoid(@Param("updated")Dealinfo updated,@Param("dealinfoid")String dealinfoid);




}