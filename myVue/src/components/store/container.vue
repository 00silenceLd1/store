<template>
  <div class="app">
    <el-container style="height:100%">
      <el-header>
        <!-- 我是样例菜单 -->
        <div class="app-header-userinfo">
          用户：{{ username }}
          <el-button style="margin-left:10px">设置</el-button>
          <el-button style="margin-left:10px" divided @click="logout">退出登录</el-button>
        </div>
      </el-header>

      <el-container style="height:100%">
        <el-aside width="220px" height="100%">
          <!-- <el-col background-color="#545c64" > -->
          <el-menu
            default-active="2"
            class="el-menu-vertical-demo"
            @open="handleOpen"
            @close="handleClose"
            @select="handleSelect"
            :unique-opened="true"
            background-color="#545c64"
            text-color="#fff"
            active-text-color="#ffd04b"
          >
            <el-submenu index="1">
              <template slot="title">
                <i class="el-icon-folder"></i>
                <span>导航一</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="1-1">选项1</el-menu-item>
                <el-menu-item index="1-2">选项2</el-menu-item>
                <el-menu-item index="1-3">选项3</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
            <el-submenu index="2">
              <template slot="title">
                <i class="el-icon-folder"></i>
                <span>导航二</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="2-1">选项1</el-menu-item>
                <el-menu-item index="2-2">选项2</el-menu-item>
                <el-menu-item index="2-3">选项3</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
            <el-submenu index="3" v-bind:class="{ hide: ishide }">
              <template slot="title">
                <i class="el-icon-folder"></i>
                <span>导航三</span>
              </template>
              <el-menu-item-group>
                <el-menu-item index="3-1">选项1</el-menu-item>
                <el-menu-item index="3-2">选项2</el-menu-item>
                <el-menu-item index="3-3">选项3</el-menu-item>
              </el-menu-item-group>
            </el-submenu>
          </el-menu>
          <!-- </el-col> -->
        </el-aside>

        <el-main>
          <template>
            <router-view></router-view>
          </template>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "Container",
  data() {
    return {
      username: "",
      password: "",
      permissions: "",
      isCollapse: false,
      ishide: true
    };
  },
  methods: {
    toggleSideBar() {
      this.isCollapse = !this.isCollapse;
    },
    logout: function() {
      this.$confirm("确认退出?", "提示", {})
        .then(() => {
          this.setCookie("", "", "", -1);
          this.$router.push("/");
        })
        .catch(() => {});
    },
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    setCookie(c_name, c_pwd, c_per, exdays) {
      var exdate = new Date(); //获取时间
      exdate.setTime(exdate.getTime() + 24 * 60 * 60 * 1000 * exdays); //保存的天数
      //字符串拼接cookie
      window.document.cookie =
        "userName" + "=" + c_name + ";path=/;expires=" + exdate.toGMTString();
      window.document.cookie =
        "userPwd" + "=" + c_pwd + ";path=/;expires=" + exdate.toGMTString();
      window.document.cookie =
        "userPer" + "=" + c_per + ";path=/;expires=" + exdate.toGMTString();
    },
    handleSelect(key, keyPath) {
      switch (key) {
        case "1-1":
          this.$router.push("/page1");
          break;
        case "1-2":
          this.$router.push("/page2");
          break;
        case "1-3":
          this.$router.push("/page3");
          break;
        case "2-1":
          this.$router.push("/page1");
          break;
        case "2-2":
          this.$router.push("/page2");
          break;
        case "2-3":
          this.$router.push("/page3");
          break;
        case "3-1":
          this.$router.push("/page1");
          break;
        case "3-2":
          this.$router.push("/page2");
          break;
        case "3-3":
          this.$router.push("/page3");
          break;
      }
    }
  },
  mounted: function() {
    //得到用户信息
    if (document.cookie.length > 0) {
      var arr = document.cookie.split("; "); //这里显示的格式需要切割一下自己可输出看下
      for (var i = 0; i < arr.length; i++) {
        var arr2 = arr[i].split("="); //再次切割
        //判断查找相对应的值
        if (arr2[0] == "userName") {
          this.username = arr2[1]; //保存到保存数据的地方
        } else if (arr2[0] == "userPwd") {
          this.password = arr2[1];
        } else if (arr2[0] == "userPer") {
          this.permissions = arr2[1];
          if (this.permissions == 2) {
            this.ishide = false;
          }
        }
      }
    }
    console.log(
      "@username=" +
        this.username +
        "    @pass=" +
        this.password +
        "    @per=" +
        this.permissions
    );
  }
};
</script>

<style scoped>
.hide {
  display: none;
}
.el-header,
.el-footer {
  background-color: #b3c0d1;
  color: #333;
  text-align: right;
  line-height: 60px;
}

.el-aside {
  background-color: #545c64;
  color: #333;
  line-height: 200px;
  height: 100%;
  width: 100%;
  margin-right: 0%;
  overflow-x: hidden;
}

.el-main {
  background-color: #e9eef3;
  color: #333;
  height: 100%;
  margin-left: 0%;
}

body > .el-container {
  margin: 0px;
}
.app {
  height: 100%;
}

.el-menu-vertical-demo {
  width: 100%;
}
.el-main{
      padding: 10px;
    }

</style>