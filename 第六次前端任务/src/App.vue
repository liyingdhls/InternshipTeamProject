<template>
  <div id="app">
    <router-view />
    <div id="nav">
      <router-link to="/">Search</router-link>
      <router-link to="/back">Back</router-link>
      <router-link to="/tab">Tab</router-link>
      <router-link to="/log">Log</router-link>
    </div>
  </div>
</template>

<style lang="less">
* {
  text-decoration: none;
  list-style: none;
  padding: 0;
  border-width: 0;
  margin: 0;
  ul li {
    list-style: none;
  }
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    height: 90vh;
    overflow: auto;
  }

  #nav {
    position: absolute;
    bottom: 0;
    left: 0;
    background-color: black;
    width: 100%;
    height: 15px;
    font-size: 20px;
    padding: 20px 0;

    a {
      font-weight: bold;
      color: white;
      width: 22%;
      display: inline-block;
      text-align: center;
      &.router-link-exact-active {
        color: #eb1008;
      }
    }
  }
}
</style>
