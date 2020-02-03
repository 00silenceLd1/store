package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */ 
public class Samplegooodsinfo implements Serializable {
    private String samplegoodsid;

    private String sampleno;

    private String instoreno;

    private String goodsname;

    private Double goodsfirstqty;

    private String goodsfirstunit;

    private String goodsmodel;

    private String goodsdetaili;

    private String samplereturnperson;

    private Long samplereturntime;

    private Double goodshandlefirstqty;

    private String goodshandlefirstunit;

    private Byte returnstatus;

    private Byte enabled;

    private Byte goodsposition;

    private String goodsevaluation;

    private static final long serialVersionUID = 1L;

    public String getSamplegoodsid() {
        return samplegoodsid;
    }

    public void setSamplegoodsid(String samplegoodsid) {
        this.samplegoodsid = samplegoodsid;
    }

    public String getSampleno() {
        return sampleno;
    }

    public void setSampleno(String sampleno) {
        this.sampleno = sampleno;
    }

    public String getInstoreno() {
        return instoreno;
    }

    public void setInstoreno(String instoreno) {
        this.instoreno = instoreno;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getGoodsfirstqty() {
        return goodsfirstqty;
    }

    public void setGoodsfirstqty(Double goodsfirstqty) {
        this.goodsfirstqty = goodsfirstqty;
    }

    public String getGoodsfirstunit() {
        return goodsfirstunit;
    }

    public void setGoodsfirstunit(String goodsfirstunit) {
        this.goodsfirstunit = goodsfirstunit;
    }

    public String getGoodsmodel() {
        return goodsmodel;
    }

    public void setGoodsmodel(String goodsmodel) {
        this.goodsmodel = goodsmodel;
    }

    public String getGoodsdetaili() {
        return goodsdetaili;
    }

    public void setGoodsdetaili(String goodsdetaili) {
        this.goodsdetaili = goodsdetaili;
    }

    public String getSamplereturnperson() {
        return samplereturnperson;
    }

    public void setSamplereturnperson(String samplereturnperson) {
        this.samplereturnperson = samplereturnperson;
    }

    public Long getSamplereturntime() {
        return samplereturntime;
    }

    public void setSamplereturntime(Long samplereturntime) {
        this.samplereturntime = samplereturntime;
    }

    public Double getGoodshandlefirstqty() {
        return goodshandlefirstqty;
    }

    public void setGoodshandlefirstqty(Double goodshandlefirstqty) {
        this.goodshandlefirstqty = goodshandlefirstqty;
    }

    public String getGoodshandlefirstunit() {
        return goodshandlefirstunit;
    }

    public void setGoodshandlefirstunit(String goodshandlefirstunit) {
        this.goodshandlefirstunit = goodshandlefirstunit;
    }

    public Byte getReturnstatus() {
        return returnstatus;
    }

    public void setReturnstatus(Byte returnstatus) {
        this.returnstatus = returnstatus;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Byte getGoodsposition() {
        return goodsposition;
    }

    public void setGoodsposition(Byte goodsposition) {
        this.goodsposition = goodsposition;
    }

    public String getGoodsevaluation() {
        return goodsevaluation;
    }

    public void setGoodsevaluation(String goodsevaluation) {
        this.goodsevaluation = goodsevaluation;
    }
}