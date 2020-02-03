package com.ld.store.service;

import java.util.List;
import com.ld.store.entity.Dealinfo;
    /**
 * Created by liudong on 2019/12/11
 */ 
public interface DealinfoService{


    int insert(Dealinfo record);

    int insertSelective(Dealinfo record);

    int batchInsert(List<Dealinfo> list);

}
