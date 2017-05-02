package mytest.basicTest.initDetail;

/**
 * Created by Chen on 02/05/2017.
 */
public class Friend {
    public Friend() {
        System.out.println("F");
    }
    static {
        System.out.println("Friend's static code block");
    }
    static int staticAge = 30;

}
