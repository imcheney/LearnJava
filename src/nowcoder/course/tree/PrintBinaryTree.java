package nowcoder.course.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 牛客网算法精讲课练习题1: 按行打印二叉树
 * 几个关键点: java中Queue接口的使用和宽度优先遍历, 二维数组每一维都需要分配堆空间;
 * last, nextLast的小技巧
 * TreeNode的简单经典定义
 * Created by Chen on 2017/4/2.
 */
public class PrintBinaryTree {
    public static int[][] printTree(TreeNode root) {
        List<List<Integer>> llist = new ArrayList<List<Integer>>();  //a list of list
        List<Integer> list = new ArrayList<Integer>();
        TreeNode last = root, nlast = root;  //last and nextLast
        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        Q.offer(root);
        while(!Q.isEmpty()) {
            TreeNode u = Q.poll();
            list.add(u.val);
            if (u.left!=null) {
                Q.offer(u.left);
                nlast = u.left;
            }
            if (u.right!=null) {
                Q.offer(u.right);
                nlast = u.right;
            }
            if (u==last) {
                llist.add(list);  //llist存入这个list
                list = new ArrayList<Integer>();  //list变量指向一个新的list
                last = nlast;
            }
        }
        int[][] A = new int[llist.size()][];
        for (int i=0; i<llist.size(); i++) {
            A[i] = new int[llist.get(i).size()];  //此处要记得给数组分配堆空间.
            for (int j=0; j<llist.get(i).size(); j++) {
                A[i][j] = llist.get(i).get(j);
            }
        }
        return A;
    }


    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(30);
        TreeNode n5 = new TreeNode(50);
        TreeNode n6 = new TreeNode(60);
        n1.left = n2; n1.right = n3;
        n2.right = n5;
        n3.left = n6;
        int[][] A = printTree(n1);
        for (int[] a:A
             ) {
            for (int e:a
                 ) {
                System.out.println(e+", ");
            }
        }
    }
}
