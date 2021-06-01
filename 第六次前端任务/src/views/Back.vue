<template>
  <div id="back">
    <div class="top">
      <button>&lt;</button>
      意见反馈
    </div>
    <div class="info">反馈信息</div>
    <div class="phone">
      手机号
      <input type="text" placeholder="请输入手机号码" />
    </div>
    <div class="feed">
      <label for="font"> 反馈类型</label>
      <select name="fun" id="">
        <option value="1">功能意见</option>
        <option value="2">2</option>
        <option value="3">3</option>
      </select>
    </div>
    <div class="option">您的意见</div>

    <textarea
      class="inp"
      type="text"
      v-model="items.text"
      ref="count"
      placeholder="请输入您的意见我们将不断优化体验"
    />
    <div v-html="number"></div>

    <button class="send">提交</button>
  </div>
</template>

<script>
export default {
  name: "back",
  data() {
    return {
      firstname: "woc",
      number: "100",
      items: {
        text: "",
      },
    };
  },
  watch: {
    //watch()监听某个值（双向绑定）的变化，从而达到change事件监听的效果
    items: {
      handler: function () {
        var _this = this;
        var _sum = 100; //字体限制为100个
        _this.$refs.count.setAttribute("maxlength", _sum);
        _this.number = _sum - _this.$refs.count.value.length;
      },
      deep: true,
    },
  },
};
</script>

<style lang="less">
* {
  padding: 0;
  border-width: 0;

  #back {
    background-color: #d9d9d9;
    text-align: left;
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
    .info {
      height: 30px;
      background-color: #eeeeee;

      padding-left: 10px;
      width: 100%;
      font-size: 20px;
    }

    .phone {
      margin-top: 10px;
      background-color: white;
      height: 30px;
      padding-left: 10px;
      input {
        float: right;
        text-align: right;
        height: 30px;
        border: none;
        outline: none;
        font-size: 20px;
        background-color: white;
      }
    }
    .feed::after {
      content: "";
      display: block;
      clear: both;
    }
    .feed {
      margin-top: 10px;
      background-color: white;
      padding-left: 10px;
      label {
        float: left;
      }
      select {
        height: 30px;
        border: none;
        outline: none;
        float: right;
        font-size: 17px;
        color: #f79d4f;
      }
    }

    .option {
      margin: 30px 0;
      background-color: #EEEEEE;
      padding-left: 10px;
    }
    .inp {
      border: 1px solid grey;
      height: 250px;
      width: 100%;
    }
    .send {
      margin: 0 5%;
      background-color: orange;
      width: 90%;
      border-radius: 10px;
      height: 50px;
      font-size: 20px;
    }
  }
}
</style>
