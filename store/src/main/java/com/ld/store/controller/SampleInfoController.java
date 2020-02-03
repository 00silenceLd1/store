package com.ld.store.controller;

import com.google.gson.Gson;
import com.ld.store.entity.Sampleinfo;
import com.ld.store.service.SampleinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liudong on 2019/12/13
 */
@RestController
@RequestMapping("/sampleInfo")
@CrossOrigin(origins = "*",maxAge = 3600)
public class SampleInfoController {
    @Autowired
    private SampleinfoService sampleinfoService;
    @RequestMapping("/queryByAll")
    public String queryByAll(String samplePerson,String sampleNo,String instoreAdmin,Long startTime,
                             Long endTime,int startRow,int pageSize) {
        List<Sampleinfo> list = null;
        Gson gson = new Gson();
        try {
            list = sampleinfoService.queryByAll(samplePerson, sampleNo, instoreAdmin, startTime, endTime, startRow, pageSize);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.toJson(list);
    }
}
