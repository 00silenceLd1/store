/*
 请求数据的接口函数
 */

import ajax from './ajax'
/* 测试接口api */
export const getJson = () => ajax('/product')

/* 学生登录接口api */
export const studentLogin = (studentName,studentNo,password) =>ajax('login/studentlogin',{studentName,studentNo,password},"POST")

/* 教师登录接口api */
export const teacherLogin = (teacherName,teacherNo,password) =>ajax('login/teacherlogin',{teacherName,teacherNo,password},"POST")

/* 根据年级和班级获取学生花名册api */
export const getStudentList = (grade,classNo) => ajax('/getStudentList', {grade,classNo},"GET")
/**
 * 关于用户的接口
 */

/*用户登录 */
export const login = (userId,userPassword) => ajax('/userInfo/login',{userId,userPassword})
/*添加用户 */
export const addUser = (userName,userPassword) => ajax('/userInfo/addUserInfo',{userName,userPassword})
/*得到所有的用户信息总数 */
export const getUserCount = () => ajax('/userInfo/queryUserInfoCount')
/*得到所有的用户信息 */
export const getUser = (startRow,pageSize) => ajax('/userInfo/queryUserInfo',{startRow,pageSize})
/*更改用户密码 */  
export const updateUserPassword = (userId,userName,userPassword) => ajax('/userInfo/updateUserInfoByUserId',{userId,userName,userPassword})
/*删除用户 */
export const deleteUser = (userId) => ajax('/userInfo/deleteUserInfo',{userId})
/**根据id查找用户 */
export const queryById = (userId) => ajax('/userInfo/deleteUserInfo',{userId})
