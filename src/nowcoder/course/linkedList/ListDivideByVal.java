package nowcoder.course.linkedList;

/**
 * nowcoder: 第5节 链表的分化练习题
 * 对于一个链表，用一个特定阈值完成对它的分化，
 * 使得小于等于这个值的结点移到前面，大于该值的结点在后面，
 * 同时保证两类结点内部的位置关系不变
 * 测试成功
 * Created by Chen on 2017/4/7.
 */
public class ListDivideByVal {
    public ListNode listDivide(ListNode head, int val) {
        ListNode p = new ListNode(-1);  //dummy head
        ListNode pHead = p;
        ListNode q = new ListNode(-1);  //dummy head
        ListNode qHead = q;
        if (head==null || head.next==null) {  //special case: 0 or 1 node only
            return head;
        }
        ListNode cur = head;
        while (cur!=null) {
            if (cur.val<=val) {
                p.next = cur;
                p = cur;
            } else {
                q.next = cur;
                q = cur;
            }
            cur = cur.next;  //go through original linkedlist
        }  // 退出循环时, p指向`小于等于链表`最后一个节点, q指向`大于链表`最后一个节点
        p.next = qHead.next;
        q.next = null;  //tail
        return pHead.next;
    }
}
