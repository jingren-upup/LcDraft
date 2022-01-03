package Amazon;

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

public class AZ_24_reverseList {

    //反转链表
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode nextNode = null;
        while(cur!=null){
            nextNode = cur.next;//nextNode 指向下一个
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;
    }
}
