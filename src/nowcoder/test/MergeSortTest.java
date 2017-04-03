package nowcoder.test;

import nowcoder.MergeSort;

/**
 * Created by Chen on 2017/4/3.
 */
public class MergeSortTest {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] A = {1,2,3,5,2,3};
        int n = 6;
        mergeSort.mergeSort(A, n);
        for (int e:A) {
            System.out.println("e = " + e);
        }
    }
}
