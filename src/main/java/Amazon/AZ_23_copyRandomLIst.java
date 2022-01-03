package Amazon;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class AZ_23_copyRandomLIst {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        //新建指针
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        //放进map里
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        //归零
        cur = head;
        while (cur != null) {

            //寻找cur的下一个节点对应的节点
            map.get(cur).next = map.get(cur.next);
            //寻找cur的random节点所对应的下一个随机节点
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
