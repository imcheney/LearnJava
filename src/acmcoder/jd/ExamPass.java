package acmcoder.jd;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * JD在线测试第二题: 求考试通过概率
 *
 * input: (example)
 * 4  //n
 * 50 50 50 50  //probability of correctness on question 1~n
 * output:
 * 0.3125
 * Created by Chen on 2017/4/7.
 */
public class ExamPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] P = new double[n+1];
        for (int i=1; i<=n; i++) {  //下标从1~n, 方便计算
            P[i] = input.nextInt()/100.0;  //input 50, get 0.50 as probability
        }  //input over
        int k = (int)Math.ceil(n*0.6);  //至少要答对60%的题目
        double[][] L = new double[n+1][n+1];  //Likelihood array; every element is 0 by default
        L[0][0] = 1;      //L[i][j] Pr(前i题, 正确了j题)的概率大小
        for (int i=1; i<n+1; i++) {  //deal with L[i][0], 初始化
            L[i][0] = (1-P[i])*L[i-1][0];
        }
        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                L[i][j] = P[i]*L[i-1][j-1] + (1-P[i])*L[i-1][j];  //DP状态转换方程
            }
        }
        double chance = 0;
        for (int i=k; i<=n; i++) {  //aggregate L[n][k], L[n][k+1] ... L[n][n],
            chance += L[n][i];  //Pr[通过] = 至少要答对百分60题目的各种可能性的和
        }
        BigDecimal res = new BigDecimal(chance).setScale(5, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(res);
    }
}
