<template>
  <div>
    <h1>ABCDEFG</h1>
    <h1>{{msg}}</h1>
    <!-- <h2>======{{id}}</h2> -->
    <!-- <h1>chuanlaideid{{fn()}}</h1> -->

    <el-table ref="singleTable" :data="tableData" highlight-current-row style="width: 100%">
      <el-table-column type="index" width="50"></el-table-column>
      <el-table-column prop="userId" label="编号" width="120"></el-table-column>
      <el-table-column prop="userName" label="姓名" width="120"></el-table-column>
      <el-table-column prop="userPression" label="权限"></el-table-column>
    </el-table>

    <el-form
      :model="ruleForm"
      status-icon
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <el-form-item label="用户名" prop="age">
        <el-input v-model.number="ruleForm.userName"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="pass">
        <el-input type="password" v-model="ruleForm.userPassWord" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">添加</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>

    <button @click="getuser">查找用户</button>
  </div>
</template>

<script>
import { getUser } from "../../api/api";
import { addUser } from "../../api/api";
export default {
  name: "headers",
  data() {
    return {
      msg: "woshishhhh",
      tableData: [],
      ruleForm:{
        userName:"",
        userPassWord:""
      },
      rules:{}
    };
  },
  // mounted() {
  //   var that = this;
  //   getUser().then(function(response) {
  //     console.log(response);
  //     that.tableData = response;
  //   });
  // },
  methods: {
    
    getuser() {
      this.axios
        .get("http://localhost:8080/userInfo/queryById?userId=1001")
        .then(function(response) {
          console.log(response.data);
        })
        .catch(function(error) {
          console.log(error);
        });
    },
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        addUser().then(
          function(response){
            if(response > 0){
              alert("添加成功");
            }
          }
        );
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
};
</script>