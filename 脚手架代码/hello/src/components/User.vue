<template>
    <div>
      <h1>用户模块</h1>

      <table border="1">
        <tr>
          <th>id</th>
          <th>name</th>
          <th>age</th>
          <th>操作</th>
        </tr>
        <tr v-for="user in users">
          <td>{{user.id}}</td>
          <td>{{user.name}}</td>
          <td>{{user.age}}</td>
          <td>
            <a href="" class="btn btn-danger">删除</a>
            <a href="" class="btn btn-default">修改</a>
          </td>
        </tr>
      </table>

      <!--使用组件-->
      <Footer></Footer>
    </div>
</template>

<script>
    import Footer from "./Footer";
    export default {
        name: "User",
        data(){
          return{
            users:[
              {id:"1",name:"zhangsan",age:17},
              {id:"2",name:"wanger",age:19},
              {id:"3",name:"lisi",age:21}
            ]
          }
        },
        methods:{

        },
        components:{
          Footer,  //注册组件
        },
        created() {  //axios
        }
    }
</script>

<style scoped>

</style>
