package mytest.reflect.arrayReflect;

import java.lang.reflect.Array;

/**
 * create multi-dimensional array
 * Created by Chen on 27/04/2017.
 */
public class MainTest_MultiDimension {
    public static void main(String[] args) {
        Object arr = Array.newInstance(String.class, 5, 10);
        //assignment
        Object subArr3 = Array.get(arr, 3);
        Array.set(subArr3, 0, "HanLang");
        Array.set(subArr3, 1,"Gouge");
        Object subArr4 = Array.get(arr, 4);
        Array.set(subArr4,5,"Guangzhou");
        Array.set(subArr4,6,"Beijing");

        String[][] strArr = (String[][])arr;
        System.out.println(strArr[3][1]);
        System.out.println(strArr[4][5]);
    }
}
