<template>
  <div class="login-container">
    <el-form
      :model="ruleForm2"
      status-icon
      ref="ruleForm2"
      label-position="left"
      label-width="0px"
      class="demo-ruleForm login-page"
    >
      <h3 class="title">系统登录</h3>
      <el-form-item prop="userid">
        <el-input type="text" v-model="ruleForm2.userid" auto-complete="off" placeholder="用户Id"></el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input type="password" v-model="ruleForm2.password" auto-complete="off" placeholder="密码"></el-input>
      </el-form-item>
      <div class="rt" style="margin-bottom:16px;margin-left:3px">
        <el-checkbox v-model="checked" style="color:#a0a0a0;margin-left:0px">一周内自动登录</el-checkbox>
      </div>
      <el-form-item style="width:100%;">
        <el-button type="primary" style="width:100%;" @click="handleSubmit">登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import { login } from "../../api/api";
export default {
  data() {
    return {
      ruleForm2: {
        userid: "",
        password: ""
      },
      permissions: "",
      username:"",
      checked: "",
    };
  },

  methods: {
    handleSubmit() {
      //保存的账号
      var id = this.ruleForm2.userid;
      //保存的密码
      var pass = this.ruleForm2.password;
      //用户权限
      var per = this.permissions;
      var that = this;
      if (id == "" || id == null) {
        alert("请输入正确的用户Id");
        return;
      } else if (pass == "" || pass == null) {
        alert("请输入正确的密码");
        return;
      }

      //调用接口校验账号密码的正确性
      //--------------------------------------------------------------------
      login(id, pass).then(
        function(res) {
          if (res != null && res != "" ) {
            if ((that.checked = true)) {
              //如果选中保存账号密码
              //传入账号名，密码，和保存天数3个参数
              that.setCookie(res.userid,res.username, res.userpassword, res.userpression, 7);
            }
            that.$router.push({ path: "/container" });
          }else{
            alert("账号或密码错误")
          }
        }
      ).catch(function(error) {
          console.log(error);
          alert("账号或密码错误")
        });
    
    },
    //设置cookie
    setCookie(c_id,c_name, c_pwd, c_per, exdays) {
      var exdate = new Date(); //获取时间
      exdate.setTime(exdate.getTime() + 24 * 60 * 60 * 1000 * exdays); //保存的天数
      //字符串拼接cookie
       window.document.cookie =
        "userId" + "=" + c_id + ";path=/;expires=" + exdate.toGMTString();
      window.document.cookie =
        "userName" + "=" + c_name + ";path=/;expires=" + exdate.toGMTString();
      window.document.cookie =
        "userPwd" + "=" + c_pwd + ";path=/;expires=" + exdate.toGMTString();
      window.document.cookie =
        "userPer" + "=" + c_per + ";path=/;expires=" + exdate.toGMTString();
    },
    //读取cookie
    getCookie: function() {
      if (document.cookie.length > 0) {
        var arr = document.cookie.split("; "); //这里显示的格式需要切割一下自己可输出看下
        for (var i = 0; i < arr.length; i++) {
          var arr2 = arr[i].split("="); //再次切割
          //判断查找相对应的值
          if (arr2[0] == "userName") {
            this.username = arr2[1];   //保存到保存数据的地方
          } else if (arr2[0] == "userPwd") {
            this.ruleForm.password = arr2[1];
          } else if (arr2[0] == "userPer") {
            this.permissions = arr2[1];
          }else if (arr2[0] == "userId") {
            this.ruleForm.userid = arr2[1];
          }
        }
      }
    },
    //清除cookie
    clearCookie: function() {
      this.setCookie("", "","", -1); //修改2值都为空，天数为负1天就好了
    }
  },

  mounted() {
    this.getCookie();
  }
};
</script>

<style scoped>
.login-container {
  width: 100%;
  height: 100%;
}
.login-page {
  -webkit-border-radius: 5px;
  border-radius: 5px;
  margin: 150px auto;
  width: 350px;
  padding: 35px 35px 15px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
label.el-checkbox.rememberme {
  margin: 0px 0px 15px;
  text-align: left;
}
.title {
  text-align: center;
}
</style>