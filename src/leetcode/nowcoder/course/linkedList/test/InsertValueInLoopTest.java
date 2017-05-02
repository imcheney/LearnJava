package leetcode.nowcoder.course.linkedList.test;

import leetcode.nowcoder.course.linkedList.ListNode;
import leetcode.nowcoder.course.linkedList.InsertValueInLoop;

/**
 * Created by Chen on 2017/4/7.
 */
public class InsertValueInLoopTest {
    public static void main(String[] args) {
        int[] A = {1,3,4,5,7};
        int[] nxt = {1,2,3,4,0};
        int val = 2;
        InsertValueInLoop insertValueInLoop = new InsertValueInLoop();
        ListNode aHead = insertValueInLoop.insert(A, nxt, val);
        ListNode p = aHead;
        while (p.next!=aHead) {
            System.out.print(p.val+"--->");
            p = p.next;
        }
        System.out.println(p.val);
    }
}
