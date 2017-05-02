package mytest.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取class对象
 * 获取指定构造方法
 * 调用Constructor.newInstance方法
 * Created by Chen on 27/04/2017.
 */
public class MainTest_getInstance {
    public static void main(String[] args) {
        Class myclass = Person.class;
        try {
            System.out.println(myclass.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            //int.class is not Integer.class
            Constructor constructor = myclass.getConstructor(String.class, int.class);
            Person person = (Person)constructor.newInstance("SparkBrown", 6);
            System.out.println(person);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
