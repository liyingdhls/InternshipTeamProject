package com.example.demo.oneday;

import org.springframework.web.bind.annotation.*;

//@Controller  //：用于定义控制器类，在Spring项目中由控制器负责将用户发来的URL请求转发到对应的服务接口(service层)，一般这个注解在类中，通常配合注解@RequestMapping：参数较复杂，后有详细说明。（Myself:可以重定向）
//如果想要返回的是网址，有一个模板是在xml文件中
@RestController  //：用于标注控制层组件，是@Controller和@ResponseBody的合集，表示这是个控制器bean，并且是将函数的返回值直接填入HTTP响应体中，是REST风格的控制器。(Myself:返回值直接在页面中显示)
//注解。Controller+RequestBody=RestController

//RestController:该注解一般会配合@RequestMapping一起使用，返回结果不会被解析为跳转路径
public class HelloController {
//    @GetMapping ("/hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "redirect:https://www.baidu.com/";
    }

    //http://localhost:8081/wlf/welcome
//    @GetMapping("/welcome")  //@GetMapping({"/welcome","/hi"}) 这个数组可以通过多个url来定向
//    public String welcome(){
//        return "index";
//    }

    //http://localhost:8081/wlf/welcome
//    @Value("${date}")  //调用配置文件   date初始化
//    private String date;  //定义成员
//    @GetMapping("/welcome")  //@GetMapping({"/welcome","/hi"}) 这个数组可以通过多个url来定向
//    public String welcome(){
//        return "今天是："+date;
//    }


    //http://localhost:8081/wlf/welcome
//    @Autowired  //从容器中自动注入，实例化    所以首先要将TodoList这个类放入容器中通过@Component这个注解
//    private TodoList todoList;
//    @GetMapping("/welcome")  //@GetMapping({"/welcome","/hi"}) 这个数组可以通过多个url来定向
//    public String welcome(){
//        return todoList.getThing();
//    }

    //传参数部分
    //111111111111    使用@RequestParam进行传参   @RequestParam(value="id",{参数为id} required=true或false, {这个参数是否必须存在} defaltValue=""{这个参数的默认值})
    //http://localhost:8081/wlf/chuan?id=70
//    @GetMapping("/chuan")
//    public String say(@RequestParam("id") Integer id){
//        return "学生的ID是："+id;
//    }

    //222222222222     使用@PathVariable进行传参
    //http://localhost:8081/wlf/chuan/80
    @GetMapping("/chuan/{id}")
    public String say(@PathVariable("id") Integer studentid){
        return "学生的ID是："+studentid;
    }
}
