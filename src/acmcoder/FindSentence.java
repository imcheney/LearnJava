package acmcoder;

import java.util.*;

/**
 * 今日头条春季实习笔试第二题
 * 给出n个句子, 然后再输入m个句子, 要求输出相同单词最多的句子. 假设每个句子的平均长度都是w左右.
 * 每个句子只有单词和空格, 没有标点, 不区分大小写.
 * 我采用的是暴力解法. 时间复杂度是O(n*w+m*n*w) = O(m*n*w), 只能过30%左右.
 * 一种更优的思路: 哈希表的key是单词, value是hashset, 存放的是有哪些句子包含这个单词.
 * 那么输入m个查询句子的时候, 就对句子中w个单词在唯一的那张哈希表中检索, 然后额外维护一张哈希表wordCount,
 * 从而对hashset取到的句子进行计数. 时间: O(n*w+m*w+m*n) = O(m*(w+n))
 * Created by Chen on 2017/3/30.
 */
public class FindSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        String[] jz = new String[n];
        List<Map<String, Integer>> maps = new ArrayList<Map<String, Integer>>();
        String useless = input.nextLine();
        for (int i=0; i<n; i++) {
            jz[i] = input.nextLine().toLowerCase();  //别忘了toLowerCase
            String[] W = jz[i].split(" ");
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int j=0; j<W.length; j++) {
                map.put(W[j], 1);
            }
            maps.add(map);
        }
        String[] query = new String[m];
        int[] R = new int[m];
        for (int i=0; i<m; i++) {  //m个查询语句
            query[i] = input.nextLine().toLowerCase();  //别忘了toLowerCase
            String[] W = query[i].split(" ");
            Map<String, Integer> map;
            int max = 0; int index = -1;
            for (int j=0; j<n; j++) {  //遍历n个map
                map = maps.get(j);
                int count = 0;
                for (int k=0; k<W.length; k++) {
                    if (map.containsKey(W[k])) {count++;}
                }
                if (count>max) {max=count; index = j;}  //max belongs to maps[j]
            }
            R[i] = index;
        }
        for (int i =0; i<m; i++) {
            System.out.println(jz[R[i]]);
        }
    }
}
