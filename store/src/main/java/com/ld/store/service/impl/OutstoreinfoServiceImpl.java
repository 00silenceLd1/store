package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.ld.store.entity.Outstoreinfo;
import com.ld.store.dao.OutstoreinfoMapper;
import com.ld.store.service.OutstoreinfoService;
/**
 * Created by liudong on 2019/12/11
 */ 
@Service
public class OutstoreinfoServiceImpl implements OutstoreinfoService{

    @Resource
    private OutstoreinfoMapper outstoreinfoMapper;

    @Override
    public int insert(Outstoreinfo record) {
        return outstoreinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Outstoreinfo record) {
        return outstoreinfoMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<Outstoreinfo> list) {
        return outstoreinfoMapper.batchInsert(list);
    }

}
