<template>  
 
  
   <ul class="getinfo">
        <li>
          <div class="fll">渠道情况</div>
          <div class="flr">互动</div>
        </li>
        <li>
          <div class="fll">代理机构或经济机构名称</div>
      
        </li>
        <li>
          <div class="fll">代码或者代理人名称</div>
          <div class="flr">北京可为</div>
        </li>
        <li>
          <div class="fll">职业资格证代码</div>
          
        </li>
        <li>
          <div class="fll">支付方式</div>
        </li>
        <li>
          <div class="fll">支付对象</div>
        </li>
        
      </ul>
   
</template>  
  
<script>  
export default {  
  data(){  
    return{  
      msg:"select04"  
    }  
  }  
}  
</script>  
  
<style lang="less">  
  .getinfo{
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
</style>  