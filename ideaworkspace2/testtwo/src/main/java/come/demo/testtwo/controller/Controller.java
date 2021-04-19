package come.demo.testtwo.controller;

import come.demo.testtwo.anno.MyAnnotation4Swagger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")  //让所有都在swagger/路径下

public class Controller {
    @PostMapping("/post")
    public String post(){
        return "post";
    }
    @GetMapping("/get")
    public String get(String a,String b){
        return "get";
    }
//  自定义注解实现不生成帮助文档
    @MyAnnotation4Swagger

    @RequestMapping("/request")
    public String request(String m){
        return "request";
    }




}
