package mytest.annotation.diy;

import java.lang.annotation.Annotation;

/**
 * Created by Chen on 27/04/2017.
 */
public class MainTest {
    public static void main(String[] args) {
        Student student = new Student();
        Annotation[] arr = student.getClass().getAnnotations();
        for (Annotation anno:arr) {
            if (anno instanceof Person) {
                System.out.println("Annotation: "+anno);
                System.out.println("name: "+((Person)anno).name());
                System.out.println("age: "+((Person)anno).age());
            }
        }
    }
}
