package nowcoder.course.sort;

/**
 * 排序部分练习
 * 堆排序
 * 写起来不熟练的话会比较慢
 * 主要容易出错的是数组遍历的下标范围 sort那里是n-1 ~ 1, buildHeap是n/2-1~0
 * Created by Chen on 2017/4/3.
 */
public class HeapSort {
    public int[] heapSort(int[] A, int n) {
        int heapsize = n;
        buildHeap(A, n);
        for (int i=n-1; i>=1; i--) {
            swap(A, 0, i);
            heapsize--;
            maxHeapify(A, heapsize, 0);
        }
        return A;
    }

    public void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }

    public void maxHeapify(int[] A, int heapsize, int x) {
        int left = x*2+1;
        int right = x*2+2;
        int max = x;
        if (left<=heapsize-1 && A[left]>A[max]) { //数组下标的调用要写在短路and的后面
            max = left;
        }
        if (right<=heapsize-1 && A[right]>A[max]) {
            max = right;
        }
        if (max!=x) {
            swap(A, x, max);
            maxHeapify(A, heapsize, max);
        }
    }

    public void buildHeap(int[] A, int heapsize) {
        for (int i=heapsize/2-1; i>=0; i--) {
            maxHeapify(A, heapsize, i);
        }
    }
}
