package com.example.demo02.controller;

import com.example.demo02.pojo.user;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Operation接口

@RestController
public class hellocontroller {

    @GetMapping(value="/hello")
    public String hello(){

        return "hello";
    }
    @PostMapping(value ="/user")
    public user user(){
        return new user();
    }
}
