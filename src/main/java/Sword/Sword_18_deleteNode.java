package Sword;

public class Sword_18_deleteNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

    public ListNode deleteNode(ListNode head,int val) {
        if (head == null){
            return null;
        }
        if (head.val == val){
            return head.next;
        }else {
            head.next = deleteNode(head.next,val);
        }
        return head;
    }
}
