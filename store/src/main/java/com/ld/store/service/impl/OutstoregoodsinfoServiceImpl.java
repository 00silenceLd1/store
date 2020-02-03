package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.ld.store.dao.OutstoregoodsinfoMapper;
import com.ld.store.entity.Outstoregoodsinfo;
import com.ld.store.service.OutstoregoodsinfoService;
/**
 * Created by liudong on 2019/12/11
 */ 
@Service
public class OutstoregoodsinfoServiceImpl implements OutstoregoodsinfoService{

    @Resource
    private OutstoregoodsinfoMapper outstoregoodsinfoMapper;

    @Override
    public int insert(Outstoregoodsinfo record) {
        return outstoregoodsinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Outstoregoodsinfo record) {
        return outstoregoodsinfoMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<Outstoregoodsinfo> list) {
        return outstoregoodsinfoMapper.batchInsert(list);
    }

}
