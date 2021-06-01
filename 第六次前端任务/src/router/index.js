import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Search.vue'

Vue.use(VueRouter)

const routes = [{
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/back',
    name: 'Back',
    component: () => import('../views/Back.vue')
  },
  {
    path: '/tab',
    name: 'Tab',
    component: () => import('../views/Tab.vue')
  },{
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue')
  },
  {
    path: '/log',
    name: 'Log',
    component: () => import('../views/Log.vue'),
    beforeEnter: (to, from, next) => {
      if (to.path === '/log') {
       
        let userData = sessionStorage.getItem('userDa');
       
        if (userData === null || userData === '') {
          
          next();
        } else {
          next('/login');
        }
      }

    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router