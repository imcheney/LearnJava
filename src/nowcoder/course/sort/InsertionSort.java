package nowcoder.course.sort;

/**
 * Created by Chen on 2017/4/3.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] A = {54,35,48,36,27,12,44,44,8,14,26,17,28};
        int n = 13;
        A = insertionSort(A, n);
        for (int e:A) {
            System.out.print(e+", ");
        }
    }
    public static int[] insertionSort(int[] A, int n) {
        // write code here
        int i, j, key;
        for (i=1; i<=n-1; i++) {
            key = A[i];
            for (j=i-1; j>=0&&A[j]>key; j--) {
                A[j+1] = A[j];
            }
            A[j+1] = key;
        }
        return A;
    }
}
