package acmcoder.jd;

import java.util.Scanner;

/**
 * JD 2017 在线测试第一题
 * input:
 * 9
 * X1X#2X#XX
 * output:
 * 3
 * Created by Chen on 2017/4/7.
 */
public class PoliceCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        char[] A = str.toCharArray();

        for (int i=0; i<A.length; i++) {
            if (A[i]!='X' && A[i]!='#' && A[i]!='c') {
                int r = Integer.parseInt(A[i]+"");
                for (int j=1;j<=r;j++) {
                    if (i-j>=0 && A[i-j]=='X') {
                        A[i-j] = 'c';  //mark
                    }
                    if (i+j<=n-1 && A[i+j]=='X') {
                        A[i+j] = 'c';
                    }
                }
            }
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            if (A[i] == 'c') {
                count++;
            }
        }
        System.out.println(count);
    }
}
