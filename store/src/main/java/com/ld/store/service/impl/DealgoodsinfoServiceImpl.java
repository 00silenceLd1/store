package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ld.store.dao.DealgoodsinfoMapper;
import java.util.List;
import com.ld.store.entity.Dealgoodsinfo;
import com.ld.store.service.DealgoodsinfoService;
/**
 * Created by liudong on 2019/12/11
 */ 
@Service
public class DealgoodsinfoServiceImpl implements DealgoodsinfoService{

    @Resource
    private DealgoodsinfoMapper dealgoodsinfoMapper;

    @Override
    public int insert(Dealgoodsinfo record) {
        return dealgoodsinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Dealgoodsinfo record) {
        return dealgoodsinfoMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<Dealgoodsinfo> list) {
        return dealgoodsinfoMapper.batchInsert(list);
    }

    @Override
    public int updateByDealgoodsinfoid(Dealgoodsinfo updated, String dealgoodsinfoid) {
        return dealgoodsinfoMapper.updateByDealgoodsinfoid(updated, dealgoodsinfoid);
    }

    @Override
    public List<Dealgoodsinfo> queryAllByDealgoodsinfoid(String dealgoodsinfoid) {
        return dealgoodsinfoMapper.queryAllByDealgoodsinfoid(dealgoodsinfoid);
    }

    @Override
    public List<Dealgoodsinfo> queryByAll(String dealNo, String goodsName, int startRow, int pageSize) {
        return dealgoodsinfoMapper.queryByAll(dealNo, goodsName, startRow, pageSize);
    }


}
