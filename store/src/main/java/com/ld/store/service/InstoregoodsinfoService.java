package com.ld.store.service;

import java.util.List;

import com.ld.store.entity.Instoregoodsinfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */
public interface InstoregoodsinfoService {


    int insert(Instoregoodsinfo record);

    int insertSelective(Instoregoodsinfo record);

    int batchInsert(List<Instoregoodsinfo> list);

    Instoregoodsinfo queryInstoregoodsById(String instoreGoodsInfoId);

    List<Instoregoodsinfo> queryInstoreGoodsInfoByParams(String instoreNo,
                                                         String instoreInfoId,
                                                         String goodsName,
                                                         int startRow,
                                                         int pageSize);

    int updateByInstoregoodsinfoid(Instoregoodsinfo updated, String instoregoodsinfoid);

}
