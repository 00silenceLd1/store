package com.ld.store.service;

import java.util.List;
import com.ld.store.entity.Samplegooodsinfo;
    /**
 * Created by liudong on 2019/12/11
 */ 
public interface SamplegooodsinfoService{


    int insert(Samplegooodsinfo record);

    int insertSelective(Samplegooodsinfo record);

    int batchInsert(List<Samplegooodsinfo> list);

}
