package mytest.basicTest;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Chen on 01/05/2017.
 */
public class SoutTest {
    //String.format("%d, %s", index, obj);
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d}, %s", index, obj.toString()));
    }

    public static void demoOperation() {
        print(1, 5 / 2);
        print(5, 5 << 2);
        print(5, 5 >> 2);
        print(3, 0 ^ -1);
    }

    public static void main(String[] args) {
//        demoOperation();
//        switchDemo();
//        StringDemo();
        setDemo();
    }

    public static void switchDemo() {
        String grade = "X";
        switch (grade) {
            case "A":
                print(1, "score>90");
                break;
            case "B":
                print(2, "score>80");
                break;
            case "C":
                print(3, "score>=60");
                break;
            case "D":
                print(4, "score<60");
                break;
            default:
                print(5, "错误的输入啊!");
        }
    }


    public static void StringDemo() {
        String str = "Hello nowcoder";
        print(1, str.indexOf('e'));
        print(2, str.charAt(7));
        print(3, str.codePointAt(7));
        print(4, str.compareTo("hello nowcoder"));
        print(5, str.compareToIgnoreCase("Hello NOWCODER"));
        print(6, str.concat("!!!"));
        print(7,str.startsWith("Hello"));
        print(8, str.endsWith("der"));
        print(9, str.contains("co"));
        print(13,str.replaceAll("o|l","a"));
        System.out.println(String.valueOf(20));
    }

    public static void setDemo() {
        Set<String> strSet = new HashSet<String>();
        for (int i=0; i<3; i++) {
            strSet.add("num"+i);
            strSet.add("num"+i);
            strSet.add("num"+i);
        }
        System.out.println(strSet);
    }
}
