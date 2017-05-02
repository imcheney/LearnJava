package mytest.basicTest.initDetail;

/**
 * Created by Chen on 02/05/2017.
 */
public class Son extends Person {
    private static int staticAge = 23;
    private Friend f = new Friend();

    static {
        System.out.println("Son's static code block!");
    }

    private static String staticAddr = "Beijing";

    public Son() {
        //子类的构造方法, 会隐含地首先执行父类的构造方法.
        System.out.println("S");
    }

    @Override
    public void print() {
        //执行覆盖方法, 不会像构造方法一样, 隐含了先执行父类的的方法.
        int i = 2;
        System.out.println(i);
    }

    public static void staticPrint() {
        System.out.println("Son's staticPrint method");
    }
}
