package Sword;

public class Sword_22_getKthFromEnd {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        int tmpk = k;
        while (tmpk>0){
            fast = fast.next;
            tmpk--;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
