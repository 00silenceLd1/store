<template>
  <div style="height: 100%;">
       <el-form
      :inline="true"
      :label-position="labelPosition"
      label-width="80px"
      :model="formLabelAlign"
    >
      <el-form-item label="用户ID">
        <el-input v-model="formLabelAlign.userId" style="width:200px"></el-input>
      </el-form-item>
      <el-form-item label="用户名字">
        <el-input v-model="formLabelAlign.userName"></el-input>
      </el-form-item>
     
    </el-form>


    <el-table ref="singleTable" :data="tableData">
      <el-table-column type="index" label="序号"></el-table-column>
      <el-table-column prop="userid" label="用户ID"></el-table-column>
      <el-table-column prop="username" label="用户姓名"></el-table-column>
      <el-table-column prop="userpassword" label="用户密码"></el-table-column>
      <el-table-column prop="userpression" label="用户权限">
        <template slot-scope="scope">
          <span v-if="scope.row.userpression == 2" style="color:red">高级权限</span>
          <span v-else style="color:black">普通权限</span>
        </template>
      </el-table-column>
      <el-table-column label="操作">
        <template slot-scope="scope">
          <el-button
            size="mini"
            @click="handleEdit(scope.row.userid,scope.row.username,scope.row.userpassword)"
          >编辑</el-button>
          <el-button size="mini" type="danger" @click="handleDelete(scope.row.userid)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      background
      layout="prev, pager, next"
      :page-size="pageSize"
      :current-page="page"
      :total="count"
      @current-change="handleCurrentChange"
    ></el-pagination>

    <el-dialog title="编辑页面" :visible.sync="dialogVisible" width="30%">
      <el-form
        :model="ruleForm2"
        status-icon
        ref="ruleForm2"
        label-position="left"
        label-width="0px"
        class="demo-ruleForm login-page"
        style="text-align:left"
      >
        <h3 class="title"></h3>
        <el-form-item prop="userid">
          <el-input type="text" v-model="ruleForm2.userId" auto-complete="off" placeholder="用户Id"></el-input>
        </el-form-item>
        <el-form-item prop="username">
          <el-input
            type="text"
            v-model="ruleForm2.userName"
            auto-complete="off"
            placeholder="用户名字 "
          ></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input type="text" v-model="ruleForm2.password" auto-complete="off" placeholder="登录密码"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="updateUser">提 交</el-button>
      </span>
    </el-dialog>

    <el-dialog title="添加页面" :visible.sync="dialogAdd" width="30%">
      <el-form
        :model="addform"
        status-icon
        ref="ruleForm2"
        label-position="left"
        label-width="0px"
        class="demo-ruleForm login-page"
        style="text-align:left"
      >
        <h3 class="title"></h3>
        <el-form-item prop="userid">
          <el-input type="text" v-model="addform.userId" auto-complete="off" placeholder="用户Id"></el-input>
        </el-form-item>
        <el-form-item prop="username">
          <el-input
            type="text"
            v-model="addform.userName"
            auto-complete="off"
            placeholder="用户名字 "
          ></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input type="text" v-model="addform.password" auto-complete="off" placeholder="登录密码"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="updateUser">提 交</el-button>
      </span>
    </el-dialog>
  </div>
</template>
  </div>
</template>

<script>
import { getUser } from "../../api/api";
import { addUser } from "../../api/api";
import { getUserCount } from "../../api/api";
import { deleteUser } from "../../api/api";
import { queryById } from "../../api/api";
import { updateUserPassword } from "../../api/api";
export default {
  name: "page1",
  data() {
    return {
      tableData: [] /**表格的数据定义 */,
      count: 0 /**行数定义 分页会用到 */,
      page: 1,
      pageSize: 5,
      dialogVisible: false,
      inputuserid: "",
      ruleForm2: {    /**弹窗  编辑按钮 */
        userId: "",
        userName: "",
        password: ""
      },
      dialogAdd:false,
      addform: {    /**添加  编辑按钮 */
        userId: "",
        userName: "",
        password: ""
      },
      labelPosition: "right",   /**搜索框 */
      formLabelAlign: {
        userId: "",
        userName: "",
        type: ""
      }
    };
  },
  components: {},
  mounted() {
    /**进入页面初始化加载请求的接口 */
    var that = this;
    getUser(0, 5).then(function(response) {
      that.tableData = response;
    });
    getUserCount().then(function(response) {
      that.count = response;
    });
  },
  methods: {
    handleEdit(id, name, pass) {
      /* 编辑按钮执行的操作 */
      this.dialogVisible = true;
      this.ruleForm2.userId = id;
      this.ruleForm2.userName = name;
      this.ruleForm2.password = pass;
    },
    updateUser() {
      this.dialogVisible = false;
      var that = this;
      updateUserPassword(
        this.ruleForm2.userId,
        this.ruleForm2.userName,
        this.ruleForm2.password
      ).then(function(res) {
        if (res > 0) {
          alert("更新成功");
          getUser((that.page - 1) * that.pageSize, that.pageSize).then(function(response) {
            that.tableData = response;
          });
        } else {
          alert("更新失败");
        }
      });
    },
    handleDelete(userid) {
      /* 删除按钮按钮执行的操作 */
      this.$confirm("此操作将删除该用户, 是否继续?", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      })
        .then(() => {
          deleteUser(userid).then(function(response) {
            if (response > 0) {
              this.$message({
                type: "success",
                message: "删除成功!"
              });
            } else {
              this.$message({
                type: "info",
                message: "删除失败"
              });
            }
          });
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: "已取消删除"
          });
        });
    },

    /**  :formatter="permissionflag" */
    // permissionflag(row, permission) {
    //   if (row.userpression == 1) {
    //     return "普通权限";
    //   } else {
    //     return "高级权限";
    //   }
    // }
    handleCurrentChange(val) {
      this.page = val;
      var that = this;
      getUser((this.page - 1) * this.pageSize, this.pageSize).then(function(
        response
      ) {
        that.tableData = response;
      });
    },
    handleClose(done) {
      this.$confirm("确认关闭？")
        .then(_ => {
          done();
        })
        .catch(_ => {});
    }
  }
};
</script>

<style scoped>
</style>


