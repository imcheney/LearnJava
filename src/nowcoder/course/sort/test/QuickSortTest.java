package nowcoder.course.sort.test;

import nowcoder.course.sort.QuickSort;

/**
 * Created by Chen on 2017/4/3.
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] A = {1,2,3,5,2,3};
        int n = 6;
        QuickSort quickSort = new QuickSort();
        A = quickSort.quickSort(A, n);
        for (int e:A) {
            System.out.println("e = " + e);
        }
    }
}