package leetcode.nowcoder.course.sort;

/**
 * 快速排序
 * space: O(lgn), 主函数这里有一个函数栈, 每层都要存储一个int q, 深度是lgn
 * Created by Chen on 2017/4/3.
 */
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        doQuickSort(A, 0, n-1);
        return A;
    }

    public void doQuickSort(int[] A, int p, int r) {
        if (p<r) {
            int q = partition(A, p, r);
            doQuickSort(A, p, q-1);
            doQuickSort(A, q+1, r);
        }
    }

    public int partition(int[] A, int p, int r) {
        int x = A[r];  //use r as pivot q
        int i = p-1;
        for (int j=p; j<=r-1; j++) {
            if (A[j]<x) {
                swap(A, j, i+1);
                i++;  //扩大小于等于区间
            }
        }
        swap(A, i+1, r);
        return i+1;
    }

    public void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
