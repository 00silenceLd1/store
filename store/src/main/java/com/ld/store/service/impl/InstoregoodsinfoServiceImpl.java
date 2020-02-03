package com.ld.store.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.ld.store.entity.Instoregoodsinfo;
import com.ld.store.dao.InstoregoodsinfoMapper;
import com.ld.store.service.InstoregoodsinfoService;
/**
 * Created by liudong on 2019/12/11
 */ 
@Service
public class InstoregoodsinfoServiceImpl implements InstoregoodsinfoService{

    @Resource
    private InstoregoodsinfoMapper instoregoodsinfoMapper;

    @Override
    public int insert(Instoregoodsinfo record) {
        return instoregoodsinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Instoregoodsinfo record) {
        return instoregoodsinfoMapper.insertSelective(record);
    }

    @Override
    public int batchInsert(List<Instoregoodsinfo> list) {
        return instoregoodsinfoMapper.batchInsert(list);
    }

    @Override
    public Instoregoodsinfo queryInstoregoodsById(String instoreGoodsInfoId) {
        return instoregoodsinfoMapper.queryInstoregoodsById(instoreGoodsInfoId);
    }

    @Override
    public List<Instoregoodsinfo> queryInstoreGoodsInfoByParams(String instoreNo, String instoreInfoId, String goodsName, int startRow, int pageSize) {
        return instoregoodsinfoMapper.queryInstoreGoodsInfoByParams(instoreNo, instoreInfoId, goodsName, startRow, pageSize );
    }

    @Override
    public int updateByInstoregoodsinfoid(Instoregoodsinfo updated, String instoregoodsinfoid) {
        return instoregoodsinfoMapper.updateByInstoregoodsinfoid(updated, instoregoodsinfoid);
    }

}
