package Amazon;
//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

public class AZ_21_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        //新建头节点
        ListNode sentinel = new ListNode(0);
        //传送节点
        ListNode d = sentinel;
        //记录和
        int sum = 0;
        //如果可以继续想家
        while(c1!=null || c2 != null){
            //取十位数
            sum  /= 10;
            //继续
            if (c1!= null){
                sum += c1.val;
                c1= c1.next;
            }
            //继续
            if (c2!= null){
                sum += c2.val;
                c2 = c2.next;
            }
            //把当前数保留
            d.next = new ListNode(sum%10);
            //下一位
            d = d.next;
        }
        //多一位
        if (sum / 10 == 1){
            d.next = new ListNode(1);
        }
        //从下一位开始
        return sentinel.next;
    }
}
