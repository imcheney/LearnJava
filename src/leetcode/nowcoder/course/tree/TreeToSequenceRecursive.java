package leetcode.nowcoder.course.tree;

import java.util.*;
/**
 * Created by Chen on 2017/4/7.
 */
public class TreeToSequenceRecursive {
    public int[][] convert(TreeNode root) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        preOrder(root, list1);
        midOrder(root, list2);
        postOrder(root, list3);
        int[][] res = new int[3][];
        res[0] = new int[list1.size()];
        res[1] = new int[list2.size()];
        res[2] = new int[list3.size()];
        for (int i=0; i<list1.size(); i++) {
            res[0][i] = list1.get(i);
            res[1][i] = list2.get(i);
            res[2][i] = list3.get(i);
        }
        return res;
    }

    public void preOrder(TreeNode root, List<Integer> list) {
        if (root==null) {return;}
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    public void midOrder(TreeNode root, List<Integer> list) {
        if (root==null) {return;}
        midOrder(root.left, list);
        list.add(root.val);
        midOrder(root.right, list);
    }

    public void postOrder(TreeNode root, List<Integer> list) {
        if (root==null) {return;}
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }
}
