package com.ld.store.dao;

import com.ld.store.entity.Samplegooodsinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liudong on 2019/12/11
 */ 
@Mapper
public interface SamplegooodsinfoMapper {
    int insert(Samplegooodsinfo record);

    int insertSelective(Samplegooodsinfo record);

    int batchInsert(@Param("list") List<Samplegooodsinfo> list);

    List<Samplegooodsinfo> queryBySamplenoAndGoodsname(@Param("sampleno")String sampleno,
                                                       @Param("goodsname")String goodsname,
                                                       @Param("startRow")int startRow,
                                                       @Param("pageSize")int pageSize);

    int updateBySamplegoodsid(@Param("updated")Samplegooodsinfo updated,@Param("samplegoodsid")String samplegoodsid);


}