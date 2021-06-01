<template>
  <div id="tab">
    <div class="radio-wrap">
      <div class="top">
        <button>&lt;</button>
        保单详情
      </div>

      <div class="radio-group">
        <span
          v-for="(tab, index) in tabs"
          :class="{ cur: iscur == index }"
          @click="(iscur = index), tabChange('select' + (index + 1))"
          v-bind:key="index"
          >{{ tab.name }}</span
        >
      </div>

      <keep-alive>
        <component v-bind:is="tabView"></component>
      </keep-alive>
    </div>
  </div>
</template>  
  
<script>
import select1 from "../components/select01.vue";
import select2 from "../components/select02.vue";
import select3 from "../components/select03.vue";
import select4 from "../components/select04.vue";
export default {
  name: "tab",
  data() {
    return {
      tabView: "select1",
      tabs: [
        { name: "基本信息" },
        { name: "险种信息" },
        { name: "交易信息" },
        { name: "渠道信息" },
      ],
      iscur: 0,
    };
  },
  components: {
    select1,
    select2,
    select3,
    select4,
  },
  methods: {
    tabChange: function (tab) {
      this.tabView = tab;
    },
  },
};
</script>  
  
<style lang="less">
* {
  
  #tab {
    background-color: gainsboro;
    .top {
      text-align: center;
      font-size: 20px;
      height: 20px;
      font-weight: bold;
      background-color: white;
      padding: 10px 0;
      button {
        background-color: white;
        float: left;
        font-size: 20px;
      }
    }

    .radio-group{
      background-color: white;
      span{
        display: inline-block;
        text-align: center;
        width: 25%;
        font-size: 15px;
        height: 30px;
       
      }
      .cur{
        font-weight: bold;
        color: orange;
        border-bottom:2px solid  orange;
      }
    }
  }
}
</style> 