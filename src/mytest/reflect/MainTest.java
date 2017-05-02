package mytest.reflect;

/**
 * 获取Class对象的三种方式
 * Class.forName(classpath)
 * obj.getClass()
 * obj.class
 * Created by Chen on 27/04/2017.
 */
public class MainTest {
    public static void main(String[] args) {
        Person person = new Person();
        ReflectShow show = new ReflectShow(person);

    }
}
