package Sword;

public class Sword_52_getIntersectionNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        //新建两个指针
        ListNode A = headA, B = headB;
        //循环遍历
        while (A!=B){
            //是否到尽头 如果到尽头换另外一个队列没到尽头继续下一个
            A = A == null? headB:A.next;
            B = B == null? headA:B.next;
        }
        return A;
    }
}
