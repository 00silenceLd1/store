package com.ld.store.service;

import java.util.List;
import com.ld.store.entity.Outstoregoodsinfo;
    /**
 * Created by liudong on 2019/12/11
 */ 
public interface OutstoregoodsinfoService{


    int insert(Outstoregoodsinfo record);

    int insertSelective(Outstoregoodsinfo record);

    int batchInsert(List<Outstoregoodsinfo> list);

}
