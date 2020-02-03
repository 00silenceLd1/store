package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */ 
public class Instoregoodsinfo implements Serializable {
    private String instoregoodsinfoid;

    private String goodsno;

    private String instoreinfoid;

    private String instoreno;

    private String goodsname;

    private String goodsmodel;

    private String goodstype;

    private Long goodsduedate;

    private Double goodsfirstqty;

    private String goodsfirstunit;

    private Integer outgoodsfirstqty;

    private Byte enabled;

    private String goodsposition;

    private static final long serialVersionUID = 1L;

    public String getInstoregoodsinfoid() {
        return instoregoodsinfoid;
    }

    public void setInstoregoodsinfoid(String instoregoodsinfoid) {
        this.instoregoodsinfoid = instoregoodsinfoid;
    }

    public String getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno;
    }

    public String getInstoreinfoid() {
        return instoreinfoid;
    }

    public void setInstoreinfoid(String instoreinfoid) {
        this.instoreinfoid = instoreinfoid;
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

    public String getGoodsmodel() {
        return goodsmodel;
    }

    public void setGoodsmodel(String goodsmodel) {
        this.goodsmodel = goodsmodel;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype;
    }

    public Long getGoodsduedate() {
        return goodsduedate;
    }

    public void setGoodsduedate(Long goodsduedate) {
        this.goodsduedate = goodsduedate;
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

    public Integer getOutgoodsfirstqty() {
        return outgoodsfirstqty;
    }

    public void setOutgoodsfirstqty(Integer outgoodsfirstqty) {
        this.outgoodsfirstqty = outgoodsfirstqty;
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