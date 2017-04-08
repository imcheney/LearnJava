package nowcoder.course.linkedList;

/**
 * nowcoder: 第2节 环形链表插值练习题
 * 测试成功
 * 主要是锻炼处理头, 尾, 空三种特殊情形的敏感.
 * Created by Chen on 2017/4/7.
 */
public class InsertValueInLoop {
    public ListNode insert(int[] A, int[] nxt, int val) {
        //create a loop linkedlist
        ListNode[] N = new ListNode[A.length];
        for (int i=0; i<=A.length-1; i++) {
            N[i] = new ListNode(A[i]);
        }
        for (int i=0; i<=A.length-1; i++) {
            N[i].next = N[nxt[i]];
        }
        ListNode head = N[0];
        ListNode node = head;
        ListNode newNode = new ListNode(val);
        //special case1: val <= head
        if (val<=head.val) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        //general case
        while (node.next!=head) {
            if (val>node.next.val) {
                node = node.next;
            } else {  //position found
                newNode.next = node.next;
                node.next = newNode;
                return head;
            }
        }
        //special case2: val >= tail
        newNode.next = head;
        node.next = newNode;
        return head;
    }
}
