package mytest.reflect;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过用户输入类的全路径, 来获取该类的成员方法和成员属性
 * 1. 获取Class类对象myclass
 * 2. 通过对象myclass获取Field, Method等信息
 * Created by Chen on 27/04/2017.
 */
public class ReflectShow {

    /**
     * 构造方法
     */
    public ReflectShow() {
        //用户输入类的全路径
        String classpath = JOptionPane.showInputDialog(null, "输入类的全路径");
        try {

            //根据类的全路径进行类的加载, 返回该类的Class对象
            Class myclass = Class.forName(classpath);
            Method[] arrOfMethod = myclass.getDeclaredMethods();
            System.out.println("获取Method信息:");
            for (Method method:arrOfMethod) {
                System.out.println(method.toString());
            }
            Field[] arrOfFields = myclass.getDeclaredFields();
            System.out.println("获取Field信息:");
            for (Field field:arrOfFields) {
                System.out.println(field.toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
