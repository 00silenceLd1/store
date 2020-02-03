package com.ld.store.service;

import java.util.List;
import com.ld.store.entity.Outstoreinfo;
    /**
 * Created by liudong on 2019/12/11
 */ 
public interface OutstoreinfoService{


    int insert(Outstoreinfo record);

    int insertSelective(Outstoreinfo record);

    int batchInsert(List<Outstoreinfo> list);

}
