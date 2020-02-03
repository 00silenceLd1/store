package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.ld.store.entity.Sampleinfo;
import com.ld.store.dao.SampleinfoMapper;
import com.ld.store.service.SampleinfoService;
/**
 * Created by liudong on 2019/12/11
 */ 
@Service
public class SampleinfoServiceImpl implements SampleinfoService{

    @Resource
    private SampleinfoMapper sampleinfoMapper;

    @Override
    public int insert(Sampleinfo record) {
        return sampleinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Sampleinfo record) {
        return sampleinfoMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<Sampleinfo> list) {
        return sampleinfoMapper.batchInsert(list);
    }

    @Override
    public Sampleinfo queryAllBySampleinfoid(String sampleinfoid) {
        return sampleinfoMapper.queryAllBySampleinfoid(sampleinfoid);
    }

    @Override
    public List<Sampleinfo> queryByAll(String samplePerson, String sampleNo, String instoreAdmin, Long startTime, Long endTime, int startRow, int pageSize) {
        return sampleinfoMapper.queryByAll(samplePerson, sampleNo, instoreAdmin, startTime, endTime, startRow, pageSize);
    }

    @Override
    public int updateBySampleinfoid(Sampleinfo updated, String sampleinfoid) {
        return sampleinfoMapper.updateBySampleinfoid(updated, sampleinfoid);
    }

}
