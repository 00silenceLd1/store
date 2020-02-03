package com.ld.store.dao;

import com.ld.store.entity.Sampleinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface SampleinfoMapper {
    int insert(Sampleinfo record);

    int insertSelective(Sampleinfo record);

    int batchInsert(@Param("list") List<Sampleinfo> list);

    Sampleinfo queryAllBySampleinfoid(@Param("sampleinfoid")String sampleinfoid);

    List<Sampleinfo> queryByAll(@Param("samplePerson")String samplePerson,
                                @Param("sampleNo")String sampleNo,
                                @Param("instoreAdmin")String instoreAdmin,
                                @Param("startTime")Long startTime,
                                @Param("endTime")Long endTime,
                                @Param("startRow")int startRow,
                                @Param("pageSize")int pageSize);

	int updateBySampleinfoid(@Param("updated")Sampleinfo updated,@Param("sampleinfoid")String sampleinfoid);


}