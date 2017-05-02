package mytest.annotation.diy;

import java.lang.annotation.*;

/**
 * 声明注解非常类似定义接口
 * 只不过interface --> @interface
 * Created by Chen on 27/04/2017.
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface Person {
    //定义注解中成员变量的写法要多加小括号, 看起来像定义方法;
    String name() default "Jack";
    int age();
}
