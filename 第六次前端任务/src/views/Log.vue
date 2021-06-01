<template>
  <div>
    <div id="login">
      <div class="loginheader">
        <a
          class="title1"
          href="javascript:;"
          rel="external nofollow"
          @click="loginWay = true"
          :class="{ way: loginWay }"
          ><b>短信登录</b></a
        >
        <a
          class="title2"
          href="javascript:;"
          rel="external nofollow"
          @click="loginWay = false"
          :class="{ way: !loginWay }"
          ><b>密码登录</b></a
        >
      </div>
      <div :class="{ on: !loginWay }">
        <section class="login_message">
          <input
            type="text"
            maxlength="11"
            placeholder="手机号"
            v-model="inpho"
          />
          <button class="get_verfication" @click="get_test">
            <span v-show="show">获取验证码</span>
            <span v-show="!show" class="scount">{{ count }} s</span>
          </button>
        </section>
        <section class="login_verfication">
          <input type="text" maxlength="8" placeholder="验证码"  v-model="testnum" />
        </section>
      </div>
      <div :class="{ on: loginWay }">
        <section class="login_message">
          <input type="text" maxlength="11" placeholder="手机号/邮箱/用户名" />
        </section>
        <section class="login_verfication">
          <input type="text" maxlength="11" minlength="6" placeholder="密码" />
        </section>
        <section class="login_message">
          <input type="text" maxlength="4" placeholder="验证码" />
          <img
            src="https://img1.baidu.com/it/u=2059945681,750924897&fm=26&fmt=auto&gp=0.jpg"
            alt=""
          />
        </section>
      </div>

      <div class="login_bottom">
        <button class="login_bottom_btn" @click="logcheck">登录</button>
        <p>关于我们</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      loginWay: true,
      loginTrue: false,
      inpho: "",
      show: true,
      count: 60,
      testnum: "",
    };
  },
  methods: {
    logcheck() {
      if(this.testnum === "zhengque"){
        sessionStorage.setItem("userDat", "Smith");
        alert("dengluchenggong")
      }else{
        alert("验证码不正确")
      }
      
      console.log("woc");
    },
    get_test() {
      console.log("检验验证码", this.inpho);
      if (this.inpho.length < 11) {
       alert("数量不够长");
      } else {
        if (!this.timer) {
       console.log("zaizheli ")
       this.count = 60;
        this.show = false;     
          this.timer = setInterval(() => {
            if (this.count > 0 && this.count <= 60) {
              this.count--;
            } else {
              this.show = true;
              clearInterval(this.timer);
              this.timer = null;
            }
          }, 1000);
        }
      }
    },
  },
};
</script>

<style  lang="less">
#login {
  input:focus,
  button:focus {
    outline: none;
  }
  .loginheader {
    margin-top: 100px;
    font-size: 15px;

    a {
      margin: 10px;
      padding: 5px;
      color: black;
      display: inline-block;
    }
    .way {
      color: #7cd6bf;
      border-bottom: 2px solid #7cd6bf;
    }
  }

  .on {
    display: none;
  }
  section {
    border: 1px solid #dfdfdf;
    width: 80%;
    height: 35px;
    margin: 20px auto;
    input {
      height: 100%;
      float: left;
      padding-left: 10px;
    }
    .get_verfication {
      background-color: white;
      height: 100%;
    }
    img {
      height: 100%;
      width: 30%;
    }
  }
  .login_bottom {
    button {
      margin: 30px 5%;
      background-color: #45dd86;
      width: 80%;
      border-radius: 10px;
      height: 50px;
      font-size: 20px;
      color: white;
    }
    p {
      color: #9c9e9e;
      font-size: 15px;
    }
  }
}
</style>
