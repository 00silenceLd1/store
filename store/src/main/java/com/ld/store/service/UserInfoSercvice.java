package com.ld.store.service;

import com.ld.store.entity.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liudong on 2019/11/30
 */
public interface UserInfoSercvice {

    int addUserInfo(Userinfo userInfo);
    int queryUserInfoCount();
    List queryUserInfo(int startRow,int pageSize);

    int updateUserInfoByUserId(String userId,String userName,String userPassword);
    //删除用户
    int deleteUserInfo(String userId);
    //登录
    Userinfo login(String userId,String userPassword);
    //通过id查找
    Userinfo queryById(String userId);
}
