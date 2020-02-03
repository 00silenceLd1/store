package com.ld.store.dao;

import com.ld.store.entity.Dealgoodsinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface DealgoodsinfoMapper {
    int insert(Dealgoodsinfo record);

    int insertSelective(Dealgoodsinfo record);

    int batchInsert(@Param("list") List<Dealgoodsinfo> list);

    int updateByDealgoodsinfoid(@Param("updated")Dealgoodsinfo updated,@Param("dealgoodsinfoid")String dealgoodsinfoid);

    List<Dealgoodsinfo> queryAllByDealgoodsinfoid(@Param("dealgoodsinfoid")String dealgoodsinfoid);

	List<Dealgoodsinfo> queryByAll(@Param("dealNo") String dealNo,
                                   @Param("goodsName")String goodsName,
                                   @Param("startRow")int startRow,
                                   @Param("pageSize")int pageSize);




}