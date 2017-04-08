package nowcoder.course.tree;

import java.util.*;

/**
 * Created by Chen on 2017/4/7.
 */
public class TreeToSequenceStack {
    public int[][] convert(TreeNode root) {
        List<TreeNode> list0 = new ArrayList<TreeNode>();
        List<TreeNode> list1 = new ArrayList<TreeNode>();
        List<TreeNode> list2 = new ArrayList<TreeNode>();
        int[][] res = new int[3][list0.size()];
        return res;
    }

    public List<TreeNode> preOrder(TreeNode root, List<TreeNode> list) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {  //if not empty
            TreeNode node = stack.pop();
            list.add(node);
            if (node.right!=null) {
                stack.push(node.right);
            }
            if (node.left!=null) {
                stack.push(node.left);  //先访问left
            }
        }
        return list;
    }

    public List<TreeNode> midOrder(TreeNode root, List<TreeNode> list) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        stack.push(root);
        while(!stack.isEmpty()) {
            if (cur.left!=null) {
                stack.push(cur.left);
                cur = cur.left;
                continue;
            }
            cur = stack.pop();
            list.add(cur);
            if (cur.right!=null) {
                stack.push(cur.right);
                cur = cur.right;
                continue;
            }
        }
        return list;
    }
}
