package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */ 
public class Outstoreinfo implements Serializable {
    private String outstoreinfoid;

    private String outstoreno;

    private Long makingtime;

    private String note;

    private String goodsdesc;

    private String approveuserid;

    private String approveusername;

    private Byte outstorestatus;

    private Byte enabled;

    private static final long serialVersionUID = 1L;

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

    public Long getMakingtime() {
        return makingtime;
    }

    public void setMakingtime(Long makingtime) {
        this.makingtime = makingtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public String getApproveuserid() {
        return approveuserid;
    }

    public void setApproveuserid(String approveuserid) {
        this.approveuserid = approveuserid;
    }

    public String getApproveusername() {
        return approveusername;
    }

    public void setApproveusername(String approveusername) {
        this.approveusername = approveusername;
    }

    public Byte getOutstorestatus() {
        return outstorestatus;
    }

    public void setOutstorestatus(Byte outstorestatus) {
        this.outstorestatus = outstorestatus;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }
}