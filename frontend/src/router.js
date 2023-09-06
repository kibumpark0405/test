
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"
import BasicBasicManager from "./components/listers/BasicBasicCards"
import BasicBasicDetail from "./components/listers/BasicBasicDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },
            {
                path: '/basics/basics',
                name: 'BasicBasicManager',
                component: BasicBasicManager
            },
            {
                path: '/basics/basics/:id',
                name: 'BasicBasicDetail',
                component: BasicBasicDetail
            },




    ]
})
