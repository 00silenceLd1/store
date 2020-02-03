package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/13
 */
public class Insotreinfo implements Serializable {
    private String instoreinfoid;

    private String instoreno;

    private String goodsdesc;

    private Long instoretime;

    private Integer inventory;

    private String scenepeople;

    private String remark;

    private Integer enabled;

    private static final long serialVersionUID = 1L;

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

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc;
    }

    public Long getInstoretime() {
        return instoretime;
    }

    public void setInstoretime(Long instoretime) {
        this.instoretime = instoretime;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getScenepeople() {
        return scenepeople;
    }

    public void setScenepeople(String scenepeople) {
        this.scenepeople = scenepeople;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}