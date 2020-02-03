package com.ld.store.controller;

import com.ld.store.entity.Insotreinfo;
import com.ld.store.service.InsotreinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Created by liudong on 2019/12/13
 */
@RestController
@RequestMapping("/instoreInfo")
@CrossOrigin(origins = "*", maxAge = 3600)
public class InstoreInfoController {
    @Autowired
    private InsotreinfoService insotreinfoService;

    @RequestMapping("/insertInstoreInfo")
    public int insertInstoreInfo(String instoreno, String goodsdesc, Long instoretime, Integer inventory, String scenepeople, String remark) {
        int result = 0;
        Insotreinfo instoreInfo = new Insotreinfo();
        instoreInfo.setEnabled(0);
        instoreInfo.setInstoreinfoid(UUID.randomUUID().toString());
        instoreInfo.setInstoreno(instoreno);
        instoreInfo.setGoodsdesc(goodsdesc);
        instoreInfo.setInstoretime(instoretime);
        instoreInfo.setInventory(1);
        instoreInfo.setScenepeople(scenepeople);
        instoreInfo.setRemark(remark);
        try {
            result = insotreinfoService.insert(instoreInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("/queryInstoreInfo")
    public List<Insotreinfo> queryInstoreInfo(String instoreNo,
                                              Long startTime,
                                              Long endTime,
                                              String scenePeople,
                                              int inventory,
                                              int startRow,
                                              int pageRow) {
        List<Insotreinfo> list = null;
        try {
            list = insotreinfoService.queryallbyparams(instoreNo, startTime, endTime, scenePeople, inventory, startRow, pageRow);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    @RequestMapping("/updateInstoreInfo")
    public int updateInstoreInfo() {
        int result = 0;
        //TODO
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
