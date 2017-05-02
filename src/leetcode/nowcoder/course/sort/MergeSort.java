package leetcode.nowcoder.course.sort;

/**
 * 牛客网排序部分练习
 * 归并排序
 * 主要是p<r这个递归退出条件, 以及merge函数中最后合并比较大小的时候各个数组的下标变化范围要小心
 * space: O(n), 最后合并这一下需要创立两个平均长度n/2的L和R数组, 因此额外空间是O(n)
 * Created by Chen on 2017/4/3.
 */
public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
        myMergeSort(A, 0, n-1);
        return A;
    }

    public void myMergeSort(int[] A, int p, int r) {
        if (p<r) {  //注意这个p<r关系到递归的退出
            int m = (p+r)/2;
            myMergeSort(A, p, m);  //left half
            myMergeSort(A, m+1, r);  //right half
            merge(A, p, m, r);
        }
    }

    public void merge(int[] A, int p, int m, int r) {
        int lenL = m-p+2, lenR = r-m+1;
        int[] L= new int[lenL], R = new int[lenR];  //takes O(n) space
        for (int i=0; i<lenL-1; i++) {
            L[i] = A[p+i];
        }
        for (int i=0; i<lenR-1; i++) {
            R[i] = A[m+1+i];
        }
        L[lenL-1] = 999999; R[lenR-1] = 999999;  //加入无穷大作为哨兵
        int x=0, y=0;
        for (int i=p; i<=r; i++) {
            if (L[x]<=R[y]) {
                A[i] = L[x];
                x++;
            } else {
                A[i] = R[y];
                y++;
            }
        }
    }
}
