package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */ 
public class Dealinfo implements Serializable {
    private String dealinfoid;

    private String dealno;

    private String dealperson;

    private Long dealtime;

    private String goodsdesc;

    private Byte enabled;

    private static final long serialVersionUID = 1L;

    public String getDealinfoid() {
        return dealinfoid;
    }

    public void setDealinfoid(String dealinfoid) {
        this.dealinfoid = dealinfoid;
    }

    public String getDealno() {
        return dealno;
    }

    public void setDealno(String dealno) {
        this.dealno = dealno;
    }

    public String getDealperson() {
        return dealperson;
    }

    public void setDealperson(String dealperson) {
        this.dealperson = dealperson;
    }

    public Long getDealtime() {
        return dealtime;
    }

    public void setDealtime(Long dealtime) {
        this.dealtime = dealtime;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }
}