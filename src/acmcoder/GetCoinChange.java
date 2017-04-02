package acmcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 找钱问题动态规划
 * 问题描述: http://haolloyin.blog.51cto.com/1177454/352115/
 * 输入:
 * 1,2,5,21,25  //代表有五种硬币, 面值分别是...
 * 63  //代表需要拼凑的金额
 * Created by Chen on 2017/3/29.
 */
public class GetCoinChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        String stringArray[] = inputString.split(",");  //输入同行带逗号必须先经过字符串切割再转换数字
        int num[]=new int[stringArray.length];
        for(int i=0;i<stringArray.length;i++) {
            num[i] = Integer.parseInt(stringArray[i]);
        }  //转化输入为数字
        int val = input.nextInt();  //需要找的金额
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<num.length; i++) {
            list.add(num[i]);
        }
        Collections.sort(list);  //对不同硬币的币值进行排序
        int count = 0;
        int[] s = new int[val+1];  //结果数组, 大小为val+1, 因为要考虑s[0]~s[val]共val+1个情况
        for (int i=0; i<=val; i++) {
            s[i] = 1000000;  //设定一个无穷大
        }
        for (int i=0; i<=list.get(1)-1; i++) {
            if (i%list.get(0)==0) {  //如果用最小面值的硬币能找干净, 那ok
                s[i] = i/list.get(0);
            }  //否则就保留1000000这个无穷大, 最后用来检测那些无法找干净的情况
        }
        for (int i=list.get(1);i<=val; i++) {
            for (int type=list.size()-1; type>=0; type--) {  //尝试从币值最大到币值最小能否进行找零
                int left = i - list.get(type);
                if (left>=0) {
                    //System.out.println("left:"+left);
                    int tempCount = s[left]+1;  //核心状态转换式 tempCount = min{s[left]+1, s[i]}
                    if (tempCount<s[i]) {s[i] = tempCount;}
                }
            }
        }
        //output result
        if (s[val]>=1000000) {
            System.out.println("-1, Cannot get a clean change solution!");
        } else {
            System.out.println("result:"+s[val]);
        }
    }
}
