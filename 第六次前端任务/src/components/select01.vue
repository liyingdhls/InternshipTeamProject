<template>
  <div class="swiper-container">
    <div class="swiper-wrapper">
      <img
        src="https://img0.baidu.com/it/u=4287848795,3303855536&fm=26&fmt=auto&gp=0.jpg"
        alt=""
        class="swiper-slide"
      />
      <img
        src="https://img1.baidu.com/it/u=2059945681,750924897&fm=26&fmt=auto&gp=0.jpg"
        alt=""
        class="swiper-slide"
      />
      <img
        src="https://img2.baidu.com/it/u=3117892751,2026550647&fm=26&fmt=auto&gp=0.jpg"
        alt=""
        class="swiper-slide"
      />
      <img
        src="https://img0.baidu.com/it/u=4171943871,3251487655&fm=26&fmt=auto&gp=0.jpg"
        alt=""
        class="swiper-slide"
      />
    </div>
    <!-- 如果需要分页器 -->
    <div class="swiper-pagination"></div>

    <!-- 如果需要导航按钮 -->
    <div class="swiper-button-prev"></div>
    <div class="swiper-button-next"></div>
  </div>
</template>  
 <script>
import Swiper from "swiper";
export default {
  name: "HelloWorld",
  data() {
    return {
      msg: "Welcome to Your Vue.js App",
    };
  },
  mounted() {
    new Swiper(".swiper-container", {
      loop: true,
      autoplay: {
        delay: 800,
      },
      // 如果需要分页器
      pagination: ".swiper-pagination",
      // 如果需要前进后退按钮
      navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
      },
    });
  },
};
</script> 
  

 <style scoped>
.swiper-container {
  width: 100%;
  height: 300px;
  margin: 20px auto;
}
</style> 
  