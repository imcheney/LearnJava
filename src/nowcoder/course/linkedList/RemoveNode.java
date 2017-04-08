package nowcoder.course.linkedList;

/**
 * Nowcoder: 只提供一个结点的指针, 要求在其所在的链表中删除这个结点
 * 注意考虑头, 尾, 空的情况
 * Created by Chen on 2017/4/7.
 */
public class RemoveNode {
    public boolean removeNode(ListNode pNode) {
        if (pNode==null || pNode.next==null) {  //null, tail
            return false;
        } else {
            pNode.val = pNode.next.val;
            pNode.next = pNode.next.next;
            return true;
        }
    }
}
