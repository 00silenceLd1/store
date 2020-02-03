package com.ld.store.entity;

import java.io.Serializable;

/**
 * Created by liudong on 2019/12/11
 */
public class Userinfo implements Serializable {
    /**
     * 用户主键
     */
    private String userid;

    /**
     * 用户名字
     */
    private String username;

    /**
     * 用户密码
     */
    private String userpassword;

    /**
     * 用户权限（1、普通仓库管理人员2超级管理员）
     */
    private Integer userpression;

    /**
     * 创建时间
     */
    private Long creattime;

    /**
     * 是否删除（0未删除，-1删除）
     */
    private Integer enabled;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getUserpression() {
        return userpression;
    }

    public void setUserpression(Integer userpression) {
        this.userpression = userpression;
    }

    public Long getCreattime() {
        return creattime;
    }

    public void setCreattime(Long creattime) {
        this.creattime = creattime;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}