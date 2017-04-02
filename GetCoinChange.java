package onlineTest.wmsj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 找钱问题动态规划程序
 * Created by Chen on 2017/3/29.
 */
public class GetCoinChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        String stringArray[] = inputString.split(",");
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
            s[i] = 1000000;  //设定一个很大的值
        }
        for (int i=0; i<=list.get(1)-1; i++) {
            s[i] = i;  //在第二小的币值前的金额, 都只能用币值1来找零
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
        System.out.println("res="+s[val]);
    }
}
