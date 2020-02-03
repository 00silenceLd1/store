package com.ld.store.service;

import java.util.List;
import com.ld.store.entity.Sampleinfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
public interface SampleinfoService{


    int insert(Sampleinfo record);

    int insertSelective(Sampleinfo record);

    int batchInsert(List<Sampleinfo> list);


        Sampleinfo queryAllBySampleinfoid( String sampleinfoid);

        List<Sampleinfo> queryByAll( String samplePerson,
                                     String sampleNo,
                                     String instoreAdmin,
                                     Long startTime,
                                     Long endTime,
                                     int startRow,
                                     int pageSize);

        int updateBySampleinfoid( Sampleinfo updated, String sampleinfoid);


    }
