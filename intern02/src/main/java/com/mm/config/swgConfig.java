package com.mm.config;


        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import springfox.documentation.builders.PathSelectors;
        import springfox.documentation.builders.RequestHandlerSelectors;
        import springfox.documentation.service.ApiInfo;
        import springfox.documentation.service.Contact;
        import springfox.documentation.spi.DocumentationType;
        import springfox.documentation.spring.web.plugins.Docket;
        import springfox.documentation.swagger2.annotations.EnableSwagger2;

        import java.util.ArrayList;

        import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

@Configuration
@EnableSwagger2
//开启Swagger2

public class swgConfig {

    @Bean
    public  Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("a");
    }
    @Bean
    public  Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("b");
    }
    @Bean
    public  Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("c");
    }

    //配置swagger的docket的bean实例
    // enable是否开启swagger
    @Bean
    public Docket docket(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("mm")
                .enable(true)
                .select()
                //RequestHandlerSelectors,配置要扫描接口的方式
                //basepackage:指定扫描的包
                //ahy():扫描全部
                //none():不扫描
                //withClassAnnotation：扫描类上的注解
                //withMethodAnnotation:扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.mm.controller"))
                //paths():过滤什么路径
                // .paths(PathSelectors.ant("/example/**"))
                .build();
    }
    //配置swagger信息：apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("mm", "", "12345678@qq.com");
        return new ApiInfo("mm的SwaggerAPI", "Api Documentation", "1.0",
                "urn:tos", contact, "Apache 2.0",
                "http://www.baidu.com", new ArrayList());

    }

}

