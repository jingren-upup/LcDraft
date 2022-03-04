package Leetcode;

import java.util.HashSet;

public class Lc_142_detectCycle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
     }
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        HashSet<ListNode> set = new HashSet<>();
        ListNode node = head;
        while(node!=null){
            if(set.contains(node)){
                return node;
            }
            set.add(node);
            node = node.next;

        }
        return null;
    }
}
