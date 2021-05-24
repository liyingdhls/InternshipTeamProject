<template>
  <div id="box">
    <div class="sear">
      <input type="text" v-model="keyword" />
      <button @click="get_search">搜索</button>
    </div>

    <div class="title">历史搜索</div>
    <ul class="his">
      <li
        v-for="item in historyList"
        @click="jump_to(item)"
        v-bind:key="item.index"
      >
        {{ item }}
      </li>
    </ul>

    <ul id="result">
      <li v-for="value in fSearch" v-bind:key="value.index">
        <img
          src="https://img1.baidu.com/it/u=2059945681,750924897&fm=26&fmt=auto&gp=0.jpg"
          alt=""
        />
        <div>
          <p class="aname">{{ value.name }}</p>
          <p class="ainfo">{{ value.intro }}</p>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "search",
  data() {
    return {
      keyword: "",
      list: [
        {
          name: "居家无忧家庭财产保险",
          src: "",
          intro: "全面守护爱家，每天仅需0.54元起",
        },
        {
          name: "熊孩子·监护人责任险",
          src: "",
          intro: "保障全面，守护童真",
        },
        {
          name: "伴你同行·交通工具意外险",
          src: "",
          intro: "一张保单两份保障，守护你和你爱的人",
        },
        {
          name: "卡安心·家庭共享账户安全",
          src: "",
          intro: "一人投保，全家安心",
        },
        {
          name: "安心养·宠物责任险",
          src: "",
          intro: "意外守护，养宠无忧",
        },
      ],
      historyList: [], //历史搜索记录，存本地
    };
  },

  methods: {
    get_search() {
      this.historyList.push(this.keyword);
    },
    jump_to(its) {
      this.keyword = its;
    },
  },
  computed: {
    //设置计算属性
    fSearch() {
      if (this.keyword) {
        return this.list.filter((value) => {
          //过滤数组元素
          return (
            value.name.includes(this.keyword) ||
            value.intro.includes(this.keyword)
          ); //如果包含字符返回true
        });
      } else {
        return this.list;
      }
    },
  },
};
</script>

<style lang="less">
* {
  #box {
    .sear{
      margin-top: 10px;
 input {
      border: 2px solid #c4c7ce;
      border-radius: 10px 0 0 10px;
      height: 26px;
      border-right: 0;
      vertical-align: top;
      padding-left: 5px;
      
    }
    input:focus, button:focus{
    outline: none;
    }
    button {
      background-color: #4e6ef2;
      border-radius: 0 10px 10px 0;
      font-size: 17px;
      padding:0 5px;
      color: white;
      height: 30px;
    }
    }
    .title{
      font-size: 15px;
      margin-top: 10px;
    }
    #result li {
      height: 100px;
      margin: 20px;
      img {
        height: 100px;
        width: 100px;
        float: left;
        border-radius: 5px;
      }
      div {
        .aname {
          padding: 10px;
          font-size: 15px;
          font-weight: bolder;
        }
        .ainfo {
          padding: 10px;
          font-size: 10px;
        }
      }
    }
  }
}
</style>