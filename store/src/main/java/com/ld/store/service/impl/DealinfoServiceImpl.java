package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.ld.store.dao.DealinfoMapper;
import com.ld.store.entity.Dealinfo;
import com.ld.store.service.DealinfoService;
/**
 * Created by liudong on 2019/12/11
 */ 
@Service
public class DealinfoServiceImpl implements DealinfoService{

    @Resource
    private DealinfoMapper dealinfoMapper;

    @Override
    public int insert(Dealinfo record) {
        return dealinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Dealinfo record) {
        return dealinfoMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<Dealinfo> list) {
        return dealinfoMapper.batchInsert(list);
    }

}
