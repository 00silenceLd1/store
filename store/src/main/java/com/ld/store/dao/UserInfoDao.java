package com.ld.store.dao;


import com.ld.store.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liudong on 2019/11/30
 */

@Mapper
@Repository
public interface UserInfoDao {
    /**
     * 增加用户信息
     *
     * @param userInfo
     * @return 更新行数
     */
    int addUserInfo(@Param("userInfo") Userinfo userInfo);
    //用户数量
    int queryUserInfoCount();

    //查找全部用户
    List<Userinfo> queryAllUserInfo(@Param("startRow")int startRow,
                                    @Param("pageSize")int pageSize);

    //更新用户密码
    int updateUserInfoByUserId(@Param("userId") String userId, @Param("userName")String userName, @Param("userPassword") String userPassword);

    //删除用户
    int deleteUserInfo(@Param("userId") String userId);

    //登录
    Userinfo login(@Param("userId") String userId, @Param("userPassword") String userPassword);

    //根据id查找用户
    Userinfo queryByUserId(@Param("userid")String userid);



}
