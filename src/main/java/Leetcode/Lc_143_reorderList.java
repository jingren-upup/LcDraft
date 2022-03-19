package Leetcode;

import java.util.HashSet;
import java.util.List;

public class Lc_143_reorderList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
     }
    }
    public void reorderList(ListNode head) {
        //find middle
        if(head == null) return;
        ListNode slow = head,fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse last half
        ListNode latter = reverse(slow.next);
        slow.next = null;
        //add it
        while(head!=null&&latter!=null){
            ListNode tmp1 = head.next;
            ListNode tmp2 = latter.next;

            latter.next = head.next;
            head.next = latter;

            head = tmp1;
            latter = tmp2;
        }


    }
    private ListNode reverse(ListNode list){
        ListNode pre = null;
        ListNode cur = list;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
