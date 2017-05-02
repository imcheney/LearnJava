package mytest.annotation;

/**
 * 测试@Inherited 这种元注解
 * Created by Chen on 27/04/2017.
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(Sub.class.isAnnotationPresent(InheritedTest.class));
    }
}
