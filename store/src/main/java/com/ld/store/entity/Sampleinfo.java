package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */ 
public class Sampleinfo implements Serializable {
    private String sampleinfoid;

    private String instoreno;

    private Byte samplestatus;

    private Long sampletime;

    private String sampleperson;

    private String sampleno;

    private String instoreadmin;

    private String remark;

    private String goodsdesc;

    private String enabled;

    private static final long serialVersionUID = 1L;

    public String getSampleinfoid() {
        return sampleinfoid;
    }

    public void setSampleinfoid(String sampleinfoid) {
        this.sampleinfoid = sampleinfoid;
    }

    public String getInstoreno() {
        return instoreno;
    }

    public void setInstoreno(String instoreno) {
        this.instoreno = instoreno;
    }

    public Byte getSamplestatus() {
        return samplestatus;
    }

    public void setSamplestatus(Byte samplestatus) {
        this.samplestatus = samplestatus;
    }

    public Long getSampletime() {
        return sampletime;
    }

    public void setSampletime(Long sampletime) {
        this.sampletime = sampletime;
    }

    public String getSampleperson() {
        return sampleperson;
    }

    public void setSampleperson(String sampleperson) {
        this.sampleperson = sampleperson;
    }

    public String getSampleno() {
        return sampleno;
    }

    public void setSampleno(String sampleno) {
        this.sampleno = sampleno;
    }

    public String getInstoreadmin() {
        return instoreadmin;
    }

    public void setInstoreadmin(String instoreadmin) {
        this.instoreadmin = instoreadmin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}