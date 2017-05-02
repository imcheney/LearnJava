package mytest.reflect;

import mytest.reflect.Person;

import java.lang.reflect.Method;

/**
 * Created by Chen on 27/04/2017.
 */
public class MainTest_visitMethod {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            Class myclass = person.getClass();
            //getDeclaredMethod才能获取到非public的方法
            Method setNameMethod = myclass.getDeclaredMethod("setName", String.class);
            setNameMethod.setAccessible(true);  //private方法需要打破access权限
            setNameMethod.invoke(person,"TomBlue");
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
