package mytest;

import java.util.*;
/**
 * Created by Chen on 2017/4/7.
 */
public class ArrayListTransformTest {
    @SuppressWarnings(value="unchecked")
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Beijing");
        list.add("Shanghai");

        list.add("Shandong");
        String[] A = list.toArray(new String[0]);
        for (String str:A) {
            System.out.println("str = " + str);
        }

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        Integer[] B = list1.toArray(new Integer[0]);
    }
}
