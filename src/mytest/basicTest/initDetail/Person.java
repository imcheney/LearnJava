package mytest.basicTest.initDetail;

/**
 * Created by Chen on 02/05/2017.
 */
public class Person {
    private int i = 1;
    static {
        System.out.println("Father's static code block");
    }

    static String staticName = "LiuDong";

    public Person() {
        System.out.println("P");
    }

    public void print() {
        System.out.println(i);
    }
}
