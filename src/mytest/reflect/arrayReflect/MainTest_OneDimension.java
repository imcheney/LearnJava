package mytest.reflect.arrayReflect;

import java.lang.reflect.Array;

/**
 * Created by Chen on 27/04/2017.
 */
public class MainTest_OneDimension {
    public static void main(String[] args) {
        Object arr = Array.newInstance(String.class, 5);
        Array.set(arr, 2, "TomBlue");
        Array.set(arr, 3, "JerryRed");
        Object objAt0 = Array.get(arr, 0);
        Object objAt3 = Array.get(arr, 3);
        System.out.println(objAt0);
        System.out.println(objAt3);
    }
}
