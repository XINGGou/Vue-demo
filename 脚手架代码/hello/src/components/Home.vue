<template>
    <div>
      <h1>主页组件</h1>

      <div style="width: 100%; height:300px;background: aqua;">
        <h1>数据内容</h1>
      </div>

      <!--使用组件-->
      <Footer></Footer>
    </div>
</template>

<script>
    import Footer from "./Footer";  //引入组件
    export default {
        name: "home",
        data(){
          return{}
        },
        methods:{

        },
        components:{
          Footer, //注册组件
        }
    }
</script>

<style scoped>

</style>
