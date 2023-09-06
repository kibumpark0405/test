
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Manager from "./components/ui/Grid"
import BasicManager from "./components/ui/BasicGrid"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/',
                name: 'Manager',
                component: Manager
            },
            {
                path: '/basics',
                name: 'BasicManager',
                component: BasicManager
            },




    ]
})
