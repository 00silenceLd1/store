package com.ld.store.service;

import java.util.List;
import com.ld.store.entity.Dealgoodsinfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
public interface DealgoodsinfoService{


    int insert(Dealgoodsinfo record);

    int insertSelective(Dealgoodsinfo record);

    int batchInsert(List<Dealgoodsinfo> list);

        int updateByDealgoodsinfoid( Dealgoodsinfo updated,  String dealgoodsinfoid);

        List<Dealgoodsinfo> queryAllByDealgoodsinfoid( String dealgoodsinfoid);

        List<Dealgoodsinfo> queryByAll( String dealNo,
                                        String goodsName,
                                        int startRow,
                                        int pageSize);


    }
