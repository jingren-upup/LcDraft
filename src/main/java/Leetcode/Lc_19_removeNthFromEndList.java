package Leetcode;

import java.util.List;
import java.util.Stack;


   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Lc_19_removeNthFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode fast = start;
        ListNode slow = start;
        slow.next = head;
        for (int i = 0; i <=n;++i){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
//        ListNode fast = head;
//        ListNode slow = head;
//        for(int i = 0;i < n;++i){
//            fast = fast.next;
//        }
//        while(fast.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        slow.next = slow.next.next;
//        return slow;
    }

}
