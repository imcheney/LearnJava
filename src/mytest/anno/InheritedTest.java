package mytest.anno;

import java.lang.annotation.*;

/**
 * Created by Chen on 27/04/2017.
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@Inherited
//这个anno只能用来标记类, 对方法, 成员变量, 接口都不起作用.
public @interface InheritedTest {
}
