package acmcoder;

import java.util.Scanner;

/**
 * 今日头条笔试1
 * 求给定数列 A中先升后降的最长连续子序列，要求 O(n)
 * 约定: 相邻数组元素A[i], A[i+1]要么大于, 要么小于, 不会出现相等
 * 思路: 动态规划left[i]和right[i]
 * 官方解法: O(n)
 * Created by Chen on 2017/4/1.
 */
public class FindHeightInArrayOptimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  //input1: 数组长度
        int[] A = new int[n];
        for(int i=0;i<n;i++) {
            A[i] = input.nextInt();  //input2: 数组A[n]
        }
        //input over
        int[] left = new int[n];  //A[i]结尾的连续最长上升序列长度
        left[0] = 1;
        int[] right = new int[n]; //A[i]开始的连续最长下降序列长度
        right[n-1] = 1;
        for (int i=1; i<n; i++) {
            if (A[i]>A[i-1]) {left[i] = left[i-1] + 1;}  //此处其实是动态规划思想
            else {left[i] = 1;}
        }
        for (int i=n-2; i>=0; i--) {
            if (A[i]>A[i+1]) {right[i] = right[i+1] + 1;}
            else {right[i] = 1;}
        }
        //find max
        int max = -1, p = -1, q = -1;
        for (int i=0; i<n; i++) {
            if (left[i]>=2 && right[i]>=2) {
                int sum = left[i] + right[i] - 1;
//                System.out.println("left:"+left[i]+" right:"+right[i]+" sum:"+sum);
                if (sum>max) {
                    max = sum;
                    p = i-left[i]+1;
                    q = i+right[i]-1;
                }
            }
        }
        System.out.println(p+" "+q);  //返回左侧和右侧的数组下标
    }
}
