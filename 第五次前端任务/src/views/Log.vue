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
          <input type="text" maxlength="11" placeholder="手机号" />
          <button disabled="disabled" class="get_verfication">
            获取验证码
          </button>
        </section>
        <section class="login_verfication">
          <input type="text" maxlength="8" placeholder="验证码" />
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
    };
  },
   methods: {
    logcheck() {
     sessionStorage.setItem("userData", "Smith");
     console.log("woc")
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
    img{
        height: 100%;
        width: 30%;
    }
  }
  .login_bottom{
      button{
      margin: 30px 5%;
      background-color: #45DD86;
      width: 80%;
      border-radius: 10px;
      height: 50px;
      font-size: 20px;
      color: white;
      }
      p{
          color: #9c9e9e;
          font-size: 15px;
      }
    
  }
}
</style>
