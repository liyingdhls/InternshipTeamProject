<template>
  <div class="stwo">
    <div class="ainfo" v-for="ainfo in info" v-bind:key="ainfo.num">
      <ul>
        <li>
          <div class="fll">序号</div>
          <div class="flr">{{ ainfo.num }}</div>
        </li>
        <li>
          <div class="fll">险别名称</div>
          <div class="flr">{{ ainfo.name }}</div>
        </li>
        <li>
          <div class="fll">是否投保不计免赔</div>
          <div class="flr">{{ ainfo.free }}</div>
        </li>
        <li>
          <div class="fll">保险金额/责任金额(元)</div>
          <div class="flr">{{ ainfo.price }}</div>
        </li>
        <li>
          <div class="fll">费率(%)</div>
          <div class="flr">{{ ainfo.rate }}</div>
        </li>
        <li>
          <div class="fll">折后保费</div>
          <div class="flr">{{ ainfo.get }}</div>
        </li>
        <li>
          <div class="fll">标准保险金额</div>
          <div class="flr">{{ ainfo.stand }}</div>
        </li>
        <li>
          <div class="fll">浮动费率系数</div>
          <div class="flr">{{ ainfo.float }}</div>
        </li>
        <li>
          <div class="fll">费率浮动事由</div>
          <div class="flr">{{ ainfo.iffloat }}</div>
        </li>
      </ul>
    </div>
  </div>
</template>  
  
<script>
export default {
  data() {
    return {
      msg: "select01",
      info: [
        {
          num: 1,
          name: "机动车损失保险",
          free: "是",
          price: "3000",
          rate: "0.0",
          get: 3000,
          stand: 500,
          float: 0.0,
          iffloat: 1,
        },
        {
          num: 2,
          name: "机动车损失保险",
          free: "是",
          price: "3000",
          rate: "0.0",
          get: 3000,
          stand: 500,
          float: 0.0,
          iffloat: 1,
        },
        {
          num: 3,
          name: "机动车损失保险",
          free: "是",
          price: "3000",
          rate: "0.0",
          get: 3000,
          stand: 500,
          float: 0.0,
          iffloat: 1,
        },
      ],
    };
  },
};
</script>  
  
<style lang="less">
.stwo {
  .ainfo {
    font-size: 20px;
    margin-top: 10px;
    padding: 20px;
    background-color: white;
    li {
      margin-bottom: 10px;
    }
    li::after {
      content: "";
      display: block;
      clear: both;
    }
    .fll {
      float: left;
      font-weight: bold;
    }
    .flr {
      float: right;
      color: gray;
    }
  }
}
</style>  