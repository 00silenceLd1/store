package com.ld.store.dao;

import com.ld.store.entity.Instoregoodsinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface InstoregoodsinfoMapper {
    int insert(Instoregoodsinfo record);

    int insertSelective(Instoregoodsinfo record);

    int batchInsert(@Param("list") List<Instoregoodsinfo> list);

    Instoregoodsinfo queryInstoregoodsById(@Param("instoreGoodsInfoId")String instoreGoodsInfoId);

    List<Instoregoodsinfo> queryInstoreGoodsInfoByParams(@Param("instoreNo")String instoreNo,
                                                         @Param("instoreInfoId")String instoreInfoId,
                                                         @Param("goodsName")String goodsName,
                                                         @Param("startRow")int startRow,
                                                         @Param("pageSize")int pageSize);
    int updateByInstoregoodsinfoid(@Param("updated")Instoregoodsinfo updated,@Param("instoregoodsinfoid")String instoregoodsinfoid);


}