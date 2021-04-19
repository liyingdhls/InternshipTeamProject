package come.demo.testtwo.config;

import come.demo.testtwo.anno.MyAnnotation4Swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import com.google.common.base.Predicates;

@Configuration
public class SwaggerConfiguration {
    /*
    * 创建Dockt类型的对象，并使用spring容器管理
    * Docket是Swagger中的全局配置对象
    * @return
    * */
    @Bean
    public Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        //API帮助文档的描述信息，（类似于标题之类的）
        ApiInfo apiinfo =
                new ApiInfoBuilder()
                        .contact(
                                new Contact(//配置swagger文档主体内容
                                        "学习Swagger2",//是文档的发布者名称
                                        "http:/www.baidu.com",//文档发布者的网站地址
                                        "wu")//文档发布者的电子邮箱
                        )
                        .title("Swagger框架学习帮助文档")  //标题
                        .description("Swagger框架学习帮助文档详细描述-Swagger框架是一个用于开发ReestAPI帮助文档的框架")
                        .version("1.0")//版本号
                        .build();//构建器模式

        //给docket上下文配置api描述信息。
        docket.apiInfo(apiinfo);

        docket = docket
                .select()  //获取Docket中的选择器。返回ApiSelectBuilder，构建选择器的（需要重新构建对象）。如：扫描什么包的注解。
                .apis(
                        Predicates.and(  //可以写多个apis，并且每个apis都可以显示，（下面的apis可以注掉了）
                            Predicates.not(  //取反。false-->true   true-->false
                                    RequestHandlerSelectors.withMethodAnnotation(   //当方法上有注解的时候返回true
                                            MyAnnotation4Swagger.class
                                    )  //方法上有注解（@MyAnnotation4Swagger）时返回true
                            ),
                            RequestHandlerSelectors.basePackage("come.demo.testtwo.controller")
                        )
                )
                //.apis(RequestHandlerSelectors.basePackage("come.demo.testtwo.controller"))   //规则：设定扫描哪个包（包含子包）中的注解。
                .paths(
                        Predicates.or(  //可以写多个路径约束,多个规则符合任意一个即可通过
                                PathSelectors.regex("/swagger/.*"),  //使用正则表达式，约束生成API文档的路径地址。(swagger/路径下生成API文档)
                                PathSelectors.regex("/.*")
                        )
                )
                .build();  //重新构建一下docket对象。
        return docket;
    }
}
