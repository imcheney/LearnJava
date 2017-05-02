package leetcode.nowcoder.course.sort.test;

import leetcode.nowcoder.course.sort.HeapSort;

/**
 * Created by Chen on 2017/4/3.
 */
public class HeapSortTest {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] A = {1,2,3,5,2,3};
        int n = 6;
        heapSort.heapSort(A, n);
        for (int e:A) {
            System.out.println("e = " + e);
        }
    }
}
