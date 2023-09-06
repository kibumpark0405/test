<template>
    <div>
        <String label="이름" v-model="value.name" :editMode="editMode"/>
        <String label="아이디" v-model="value.userId" :editMode="editMode"/>
        <CompanyId offline label="회사아이디" v-model="value.companyId" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'Basic',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "basics"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

