package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */ 
public class Dealgoodsinfo implements Serializable {
    private String dealgoodsinfoid;

    private String dealno;

    private String samplegoodsid;

    private String goodsname;

    private Double goodsfirstqty;

    private String goodsfirstunit;

    private String goodsmodel;

    private Byte dealstatus;

    private Byte enabled;

    private String goodsposition;

    private static final long serialVersionUID = 1L;

    public String getDealgoodsinfoid() {
        return dealgoodsinfoid;
    }

    public void setDealgoodsinfoid(String dealgoodsinfoid) {
        this.dealgoodsinfoid = dealgoodsinfoid;
    }

    public String getDealno() {
        return dealno;
    }

    public void setDealno(String dealno) {
        this.dealno = dealno;
    }

    public String getSamplegoodsid() {
        return samplegoodsid;
    }

    public void setSamplegoodsid(String samplegoodsid) {
        this.samplegoodsid = samplegoodsid;
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

    public Byte getDealstatus() {
        return dealstatus;
    }

    public void setDealstatus(Byte dealstatus) {
        this.dealstatus = dealstatus;
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