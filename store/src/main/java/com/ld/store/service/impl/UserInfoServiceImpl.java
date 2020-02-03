package com.ld.store.service.impl;

import com.ld.store.dao.UserInfoDao;
import com.ld.store.entity.Userinfo;
import com.ld.store.service.UserInfoSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liudong on 2019/11/30
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoSercvice {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public int addUserInfo(Userinfo userInfo) {
        int count =0;
        try{
            count = userInfoDao.addUserInfo(userInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public int queryUserInfoCount() {
       int count =0;
       try{
           count = userInfoDao.queryUserInfoCount();
       }catch (Exception e){
           e.printStackTrace();
       }
       return count;
    }

    @Override
    public List queryUserInfo(int startRow,int pageSize) {
        List<Userinfo> list =null;
        try{
            list = userInfoDao.queryAllUserInfo(startRow,pageSize);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int updateUserInfoByUserId(String userId,String userName,String userPassword) {
        int count =0;
        try{
            count = userInfoDao.updateUserInfoByUserId(userId,userName,userPassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public int deleteUserInfo(String userId) {
        int count =0;
        try{
            count =userInfoDao.deleteUserInfo(userId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public Userinfo login(String userId, String userPassword) {
        Userinfo userInfo = new Userinfo();
        try{
            userInfo = userInfoDao.login(userId, userPassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userInfo;
    }

    @Override
    public Userinfo queryById(String userId) {
        Userinfo userInfo = new Userinfo();
        try{
            userInfo = userInfoDao.queryByUserId(userId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userInfo;
    }


}
