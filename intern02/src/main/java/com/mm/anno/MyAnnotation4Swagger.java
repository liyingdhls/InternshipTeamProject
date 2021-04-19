package com.mm.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Target目标：描述当前注解能定义在什么资源上
 * 属性：value
 * 定义具体资源包括：（最常用的四个）
 *      -ElementType.METHOD，可以定义在方法上
 *      -ElementType.TYPE，可以定义在类型上
 *      -ElementType.FIELD，可以定义在属性上
 *      -ElementType.PARAMETER，可以定义在方法参数上
 * */
@Target(value={ElementType.METHOD,ElementType.TYPE})
/*
 * @Retention注解含义：当前注解在什么时候有效
 * 属性value
 * 定义具体的生效标记
 *      -RetentionPolicy.RUNTIME，运行时有效
 *      -RetentionPolicy.SOURCE，源码中有效
 *      -RetentionPolicy.CLASS，字节码有效
 * */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation4Swagger {
    //自定义注解中的属性，相当于 @MyAnnotation4Swagger(value="")
    String value() default  "";
}
