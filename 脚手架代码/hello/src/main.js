// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'          //在页面中引入vue.js
import App from './App'        //引入自定义组件
import router from './router'  //引入vue route js

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({  //vue全局实例
  el: '#app',  //绑定vue实例全局作用范围
  router,      //注册路由对象
  components: { App },  //注册App组件
  template: '<App/>'
})
