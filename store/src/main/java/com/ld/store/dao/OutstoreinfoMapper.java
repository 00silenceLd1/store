package com.ld.store.dao;

import com.ld.store.entity.Outstoreinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface OutstoreinfoMapper {
    int insert(Outstoreinfo record);

    int insertSelective(Outstoreinfo record);

    int batchInsert(@Param("list") List<Outstoreinfo> list);

    List<Outstoreinfo> queryAllByOutstoreinfoid(@Param("outstoreinfoid")String outstoreinfoid);

	List<Outstoreinfo> queryByAll(@Param("outStoreNo")String outStoreNo,
                                  @Param("startTime")Long startTime,
                                  @Param("endTime")Long endTime,
                                  @Param("startRow")int startRow,
                                  @Param("pageSize")int pageSize);


}