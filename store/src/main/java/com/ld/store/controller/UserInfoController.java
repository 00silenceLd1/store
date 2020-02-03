package com.ld.store.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ld.store.entity.Userinfo;
import com.ld.store.service.UserInfoSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by liudong on 2019/11/30
 */
@RestController
@RequestMapping("/userInfo")
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserInfoController {
    @Autowired
    private UserInfoSercvice userInfoSercvice;

    @RequestMapping("/addUserInfo")
    public void addUserInfo(String  userName,String userPassword) {
        Userinfo userInfo = new Userinfo();
        userInfo.setCreattime(System.currentTimeMillis());
        userInfo.setEnabled(0);
        userInfo.setUserid(UUID.randomUUID().toString());
        userInfo.setUsername(userName);
        userInfo.setUserpassword(userPassword);
        userInfo.setUserpression(0);
        try {
            userInfoSercvice.addUserInfo(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/queryUserInfoCount")
    public int queryUserInfoCount(){
        int  count =0;
        try {
            count   = userInfoSercvice.queryUserInfoCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    @RequestMapping("/queryUserInfo")
    public String queryUserInfo(int startRow,int pageSize) {
        java.util.List list = new ArrayList();
        Gson gson = new Gson();
         try {
            list  = userInfoSercvice.queryUserInfo(startRow,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.toJson(list);
    }

    @RequestMapping("/updateUserInfoByUserId")
    public int updateUserInfoByUserId(String userId,String userName,String userPassword){
        int count =0;
        try{
            count  = userInfoSercvice.updateUserInfoByUserId(userId,userName,userPassword);
        }catch(Exception e){
            e.printStackTrace();
        }
        return count;
    }
    @RequestMapping("/deleteUserInfo")
    public int deleteUserInfo(String userId){
        Gson gson = new Gson();
        int count =0;
        try{
            count = userInfoSercvice.deleteUserInfo(userId);
        }catch(Exception e){
            e.printStackTrace();
        }
        return count;
    }
    @RequestMapping("/login")
    public String login(String userId,String userPassword){
        Userinfo userInfo = new Userinfo();
        Gson gson = new Gson();
        try{
            userInfo = userInfoSercvice.login(userId, userPassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return gson.toJson(userInfo);
    }
    @RequestMapping("/queryById")
    public int queryById(String userId){
        Userinfo userInfo = new Userinfo();
        int i = 0;
        try{
            userInfo = userInfoSercvice.queryById(userId);
            if(userInfo != null)i=1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }
}
