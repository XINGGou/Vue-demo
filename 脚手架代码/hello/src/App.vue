<template>
  <div id="app">

    <a href="#/">主页</a>
    <a href="#/user">用户模块</a>
    <a href="#/student">学生模块</a>

    <!--用来展示路由组件-->
    <router-view/>
  </div>
</template>

<script>
export default {  //es6暴露当前组件对象
  name: 'App',
}
</script>

<style>
  .aa{
    background-color: chocolate;
  }
</style>
