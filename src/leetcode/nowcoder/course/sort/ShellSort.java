package leetcode.nowcoder.course.sort;

/**
 * space: O(1), 几乎没有额外空间
 * Created by Chen on 2017/4/3.
 */
public class ShellSort {
    public int[] shellSort(int[] A, int n) {
        // write code here
        for (int steplen=n/2;steplen>=1; steplen/=2) {
            sort(A, steplen);
        }
        return A;
    }

    public void sort(int[] A, int steplen) {
        for (int i=steplen; i<=A.length-1; i++) {
            for (int j=i; j>=steplen; j-=steplen) {
                if (A[j]<A[j-steplen]) {
                    int temp = A[j];
                    A[j] = A[j-steplen];
                    A[j-steplen] = temp;
                }
            }
        }
    }
}
