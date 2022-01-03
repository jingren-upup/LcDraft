package Amazon;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class AZ_22_reverseKGroup {
    public ListNode reverseKg(ListNode head, int k) {
        //定义假节点
        ListNode dummy = new ListNode(0);
        // dummy->1->2->3->4->5
        dummy.next = head;
        //初始化pre和end都指向dummy。pre指每次要翻转的链表的头结点的上一个节点。end指每次要翻转的链表的尾节点
        ListNode pre = dummy;
        ListNode end = dummy;
        //当前不为空
        while(end.next != null){
            //循环k次，找到需要翻转的链表的结尾,这里每次循环要判断end是否等于空,因为如果为空，end.next会报空指针异常。
            //dummy->1->2->3->4->5 若k为2，循环2次，end指向2
            for (int i = 0;i < k && end!=null;++i){
                end = end.next;
            }
            //为空退出
            if (end == null){
                break;
            }
            //记录下要翻转链表的头节点
            ListNode start = pre.next;
            //先记录下end.next,方便后面链接链表
            ListNode next=end.next;
            //断开链表
            end.next = null;
            //翻转链表,pre.next指向翻转后的链表。1->2 变成2->1。 dummy->2->1
            pre.next = reverse(start);
            //翻转后节点变到最后并重新链接
            start.next = next;
            //将pre换成下次要反转的头节点的上一个几start
            pre = start;
            //翻转结束
            end = pre;

        }
        return dummy.next;
    }
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
