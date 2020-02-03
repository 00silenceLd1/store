package com.ld.store.service;

import com.ld.store.entity.Insotreinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liudong on 2019/12/11
 */

public interface InsotreinfoService {


    int insert(Insotreinfo record);

    int batchInsert(List<Insotreinfo> list);

    /**
     * @param instoreInfoId
     * @return
     */
    Insotreinfo queryAllByInstoreinfoid(String instoreInfoId);

    /**
     * @param instoreNo
     * @param startTime
     * @param endTime
     * @param scenePeople
     * @param inventory
     * @param startRow
     * @param pageRow
     * @return
     */
    List<Insotreinfo> queryallbyparams(String instoreNo,
                                       Long startTime,
                                       Long endTime,
                                       String scenePeople,
                                       int inventory,
                                       int startRow,
                                       int pageRow);
    int updateInstoreInfo( Insotreinfo insotreinfo);

}



