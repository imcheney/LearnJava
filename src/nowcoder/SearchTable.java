package nowcoder;

/**
 * Created by Chen on 2017/4/2.
 */
public class SearchTable {
    /**
     * 解法1: 遍历每列, 使用binarySearch
     * 时间开销: m行n列, O(mlgn)
     * @param target
     * @param array
     * @return
     */
    public boolean FindWithBinarySearch(int target, int [][] array) {
        int n = array[0].length;  //列数
        for (int i=0; i<n; i++) {
            int loc = binarySearch(target, array[i], 0, n-1);
            if (loc!=-1) {return true;}
        }
        return false;
    }

    public static int binarySearch(int v, int[] A, int p, int r) {
        while (p<=r) {
            int m = (p+r)/2;
            if (v==A[m]) {return m;}  //found
            else if (v<A[m]){r = m-1;}
            else {p = m+1;}
        }
        return -1;  //not found
    }

    /**
     * 解法2: jumpTable法, 从左下角或者右上角出发, 只允许row,col单向行进(类似象棋的兵)
     * 时间开销: O(m+n)
     * @param target
     * @param array
     * @return
     */
    public boolean FindWithTableJump(int target, int[][] array) {
        int row = array.length-1;
        int col = 0;
        while (row>=0&&col<array[0].length) {
            if (target<array[row][col]) {
                row--;
            } else if (target>array[row][col]) {
                col++;
            } else {
                return true;  //found
            }
        }
        return false; //not found
    }
}
