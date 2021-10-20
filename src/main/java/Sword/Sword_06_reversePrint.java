package Sword;

import org.jruby.ast.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Sword_06_reversePrint {
    public int[] reversePrint(ListNode head) {
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            len++;
//            curr = curr.next;
        }
        curr = head;
        int[] result = new int[len];
        while(curr!=null){
//            result[len-1] = curr.val;
            len--;
//            curr = curr.next;
        }
        return result;
    }
}
