package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */ 
public class Outstoregoodsinfo implements Serializable {
    private String outstoredealformsid;

    private String outstoreinfoid;

    private String outstoreno;

    private String instoreno;

    private String goodsname;

    private Double goodsfirstqty;

    private String goodsfirstunit;

    private String goodsmodel;

    private String consignee;

    private String note;

    private Byte enabled;

    private String goodsposition;

    private static final long serialVersionUID = 1L;

    public String getOutstoredealformsid() {
        return outstoredealformsid;
    }

    public void setOutstoredealformsid(String outstoredealformsid) {
        this.outstoredealformsid = outstoredealformsid;
    }

    public String getOutstoreinfoid() {
        return outstoreinfoid;
    }

    public void setOutstoreinfoid(String outstoreinfoid) {
        this.outstoreinfoid = outstoreinfoid;
    }

    public String getOutstoreno() {
        return outstoreno;
    }

    public void setOutstoreno(String outstoreno) {
        this.outstoreno = outstoreno;
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

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getGoodsposition() {
        return goodsposition;
    }

    public void setGoodsposition(String goodsposition) {
        this.goodsposition = goodsposition;
    }
}