package com.ld.store.dao;

import com.ld.store.entity.Insotreinfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liudong on 2019/12/13
 */
@Mapper
public interface InsotreinfoMapper {
    int insert(Insotreinfo record);

    int batchInsert(@Param("list") List<Insotreinfo> list);

    Insotreinfo queryAllByInstoreinfoid(@Param("instoreInfoId") String instoreInfoId);

    List<Insotreinfo> queryallbyparams(@Param("instoreNo") String instoreNo,
                                       @Param("startTime") Long startTime,
                                       @Param("endTime") Long endTime,
                                       @Param("scenePeople") String scenePeople,
                                       @Param("inventory") int inventory,
                                       @Param("startRow") int startRow,
                                       @Param("pageRow") int pageRow);
    int updateInstoreInfo( Insotreinfo insotreinfo);
}