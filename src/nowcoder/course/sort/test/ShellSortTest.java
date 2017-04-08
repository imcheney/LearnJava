package nowcoder.course.sort.test;

import nowcoder.course.sort.ShellSort;

/**
 * Created by Chen on 2017/4/3.
 */
public class ShellSortTest {
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] A = {1,2,3,5,2,3};
        int n = 6;
        shellSort.shellSort(A, n);
        for (int e:A) {
            System.out.println("e = " + e);
        }
    }
}
