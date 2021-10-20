//package Sword;
//
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//public class Sword_35_copyRandomList {
//
//    public Node Sword_35_copyRandomList(Node head){
//        HashMap<Node,Node> map = new HashMap<>();
//        if (head ==  null){
//            return null;
//        }
//        if (!map.containsKey(head)){
//            Node newNode = new Node(head.val);
//            map.put(head,newNode);
//            newNode.next = copyRandomList(head.next);
//            newNode.random = copyRandomList(head.random);
//        }
//        return map.get(head);
//    }
//}
