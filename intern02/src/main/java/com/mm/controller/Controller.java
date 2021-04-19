package com.mm.controller;


import com.mm.anno.MyAnnotation4Swagger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controller {
    @GetMapping("/hello")
    public String post() {
        return "hello";
    }

    @GetMapping("/get")
    public String get(String a, String b) {
        return "get";
    }

    //  自定义注解实现不生成帮助文档
//    @MyAnnotation4Swagger

    @RequestMapping("/request")
    public String request(String m) {
        return "request";
    }
}