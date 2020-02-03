package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ld.store.dao.SamplegooodsinfoMapper;
import java.util.List;
import com.ld.store.entity.Samplegooodsinfo;
import com.ld.store.service.SamplegooodsinfoService;
/**
 * Created by liudong on 2019/12/11
 */ 
@Service
public class SamplegooodsinfoServiceImpl implements SamplegooodsinfoService{

    @Resource
    private SamplegooodsinfoMapper samplegooodsinfoMapper;

    @Override
    public int insert(Samplegooodsinfo record) {
        return samplegooodsinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Samplegooodsinfo record) {
        return samplegooodsinfoMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<Samplegooodsinfo> list) {
        return samplegooodsinfoMapper.batchInsert(list);
    }

}
