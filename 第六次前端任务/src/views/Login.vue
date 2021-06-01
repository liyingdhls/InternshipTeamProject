<template>
  <div id="person">
    <div class="top">
      <button class="close">X</button>
      个人中心
      <button class="set">···</button>
    </div>
    <div class="middle">
      <img
        src="https://img1.baidu.com/it/u=2059945681,750924897&fm=26&fmt=auto&gp=0.jpg"
        alt=""
      />
      <div class="user">用户名</div>
    </div>

    <ul class="content">
      <li v-for="afunc in func" v-bind:key="afunc.index">
        <img
          src="https://img1.baidu.com/it/u=2059945681,750924897&fm=26&fmt=auto&gp=0.jpg"
          alt=""
        />
        <div class="info">{{ afunc.sect }}</div>
        <button>&gt;</button>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      func: [
        {
          src: "",
          sect: "体验人管理",
        },
        {
          src: "",
          sect: "我的评估问卷",
        },
        {
          src: "",
          sect: "设置",
        },
        {
          src: "",
          sect: "二维码推荐",
        },
        {
          src: "",
          sect: "意见反馈",
        },
        {
          src: "",
          sect: "关于我们",
        },
      ],
    };
  },
};
</script>

<style lang="less">
* {
  padding: 0;
  border-width: 0;
  font-size: 15px;
  background-color: rgb(228, 225, 225);
  button {
    background-color: rgb(228, 225, 225);
  }
  #person {
    .top {
      padding: 10px;
      .close {
        float: left;
      }
      .set {
        float: right;

        font-weight: bolder;
      }
    }
    .middle {
      background-color: white;
      img {
        height: 100px;
        width: 100px;
        margin: 20px auto;
      }
      .user {
        background-color: white;
        padding-bottom: 20px;
      }
    }
    .content {
      margin-top: 10px;
      li {
        display: inline-block;
        width: 100%;
       padding: 10px 0 ;
        background-color: white;

        img {
          width: 20px;
          height: 20px;
          float: left;
          padding-left: 20px;
           background-color: white;
           
        }
        .info {
          float: left;
          background-color: white;
          margin-left: 5px;
        }
        button {
          float: right;
          background-color: right;
           background-color: white;
           padding-right: 20px;
        }
      }
    }
  }
}
</style>
