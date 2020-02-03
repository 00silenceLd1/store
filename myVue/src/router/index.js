import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import headers from '@/components/public/headers'
import myobject from '@/components/public/myobject'

import container from '@/components/store/container'
import page1 from '@/components/store/page1'
import page2 from '@/components/store/page2'
import page3 from '@/components/store/page3'
import login from '@/components/store/login'

Vue.use(Router)
const routerPush = Router.prototype.push
Router.prototype.push = function push(location) {
  return routerPush.call(this, location).catch(error=> error)
}
export default new Router({
  routes: [
    {
      path: '/HelloWorld',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/headers',
      name: 'headers',
      component: headers
    },
    {
      path: '/myobject',
      name: 'myobject',
      component: myobject
    },
    {
      path: '/',
      name: 'login',
      component: login
    },
    {
      path:'/container',
      name:'container',
      component:container,
      redirect:'/page1',
      children:[
        {
          path:'/page1',
          name:'page1',
          component:page1
        },
        {
          path:'/page2',
          name:'page2',
          component:page2
        },
        {
          path:'/page3',
          name:'page3',
          component:page3
        }
      ]
    }
  ]
})
//对每次访问之前都要先看是否已经登录
    //  router.beforeEach((to,from,next)=>{
    //        if(to.path.startsWith('/login')){
    //           window.sessionStorage.removeItem('access-token');
    //           next();
    //        }else{
    //            let token = window.sessionStorage.getItem('access-token');
    //            if(!token){
    //                //未登录  跳回主页面
    //                next({path:'/login'});
    //            }else{
    //                next();
    //            }
    //        }
           
    //    });
