package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ld.store.entity.Insotreinfo;
import com.ld.store.dao.InsotreinfoMapper;
import com.ld.store.service.InsotreinfoService;import java.util.List;

/**
 * Created by liudong on 2019/12/11
 */
@Service("instoreInfoService")
public class InsotreinfoServiceImpl implements InsotreinfoService {

    @Resource
    private InsotreinfoMapper insotreinfoMapper;

    @Override
    public int insert(Insotreinfo record) {

        return insotreinfoMapper.insert(record);
    }

    @Override
    public int batchInsert(List<Insotreinfo> list) {
        return insotreinfoMapper.batchInsert(list);
    }

    @Override
    public Insotreinfo queryAllByInstoreinfoid(String instoreInfoId) {
        return insotreinfoMapper.queryAllByInstoreinfoid(instoreInfoId);
    }

    @Override
    public List<Insotreinfo> queryallbyparams(String instoreNo, Long startTime, Long endTime, String scenePeople, int inventory, int startRow, int pageRow) {
        return insotreinfoMapper.queryallbyparams(instoreNo, startTime, endTime, scenePeople, inventory, startRow, pageRow);
    }

    @Override
    public int updateInstoreInfo(Insotreinfo insotreinfo) {
        return insotreinfoMapper.updateInstoreInfo(insotreinfo);
    }


}



