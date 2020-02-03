<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <router-link :to="'/headers'">跳到head</router-link>
    <router-link :to="'/myobject'">跳到myobject</router-link>
    <input type="button" value="按钮" v-bind:title="mytitle">
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  data:{
     mytitle: 'Welcome to Your Vue.js App'
  
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
