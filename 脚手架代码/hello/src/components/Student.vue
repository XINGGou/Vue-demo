<template>
    <div>
      <h1>学生模块</h1>

      <table border="1">
        <tr>
          <th>id</th>
          <th>name</th>
          <th>age</th>
          <th>操作</th>
        </tr>
        <tr v-for="student in students">
          <td>{{student.id}}</td>
          <td>{{student.name}}</td>
          <td>{{student.age}}</td>
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
        name: "Student",
        data(){
          return {
            students:[
              {id:"1",name:"王帅",age:17},
              {id:"2",name:"树鹏",age:19},
              {id:"3",name:"佳俊",age:21}
            ]
          }
        },
        methods:{

        },
        components:{
          Footer,  //注册组件
        }
    }
</script>

<style scoped>

</style>
