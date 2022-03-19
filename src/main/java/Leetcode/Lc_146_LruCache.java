package Leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class
Lc_146_LruCache {

}
//    class LinkNode{
//        int key;
//        int value;
//        LinkNode pre;
//        LinkNode next;
//    }
//    private void addNode(LinkNode node){
//        node.pre = head;
//        node.next = head.next;
//        head.next.pre = node;
//        head.next = node;
//    }
//    private void removeNode(LinkNode node){
//        LinkNode pre = node.pre;
//        LinkNode next = node.next;
//
//        pre.next = next;
//        next.pre = pre;
//    }
//    private void movetoHead(LinkNode node){
//        removeNode(node);
//        addNode(node);
//    }
//    private LinkNode pop(){
//        LinkNode res = tail.pre;
//        removeNode(res);
//        return res;
//    }
//    private Map<Integer, LinkNode> cache = new HashMap<>();
//    private int size;
//    private int capacity;
//    private LinkNode head, tail;
//    public LRUCache(int capacity) {
//        this.size = 0;
//        this.capacity = capacity;
//
//        head = new LinkNode();
//        // head.prev = null;
//
//        tail = new LinkNode();
//        // tail.next = null;
//
//        head.next = tail;
//        tail.pre = head;
//    }
//    public int get(int key) {
//        LinkNode node = cache.get(key);
//        if (node == null) return -1;
//
//        // move the accessed node to the head;
//        movetoHead(node);
//        return node.value;
//    }
//    public void put(int key, int value) {
//        LinkNode node = cache.get(key);
//
//        if(node == null) {
//            LinkNode newNode = new LinkNode();
//            newNode.key = key;
//            newNode.value = value;
//
//            cache.put(key, newNode);
//            addNode(newNode);
//
//            ++size;
//
//            if(size > capacity) {
//                // pop the tail
//                LinkNode tail = pop();
//                cache.remove(tail.key);
//                --size;
//            }
//        } else {
//            // update the value.
//            node.value = value;
//            movetoHead(node);
//        }
//
//
//
//
//
//
//
//
//
//
//
//
////    int capacity;
////    LinkedHashMap<Integer,Integer> cache;
////    public LRUCache(int capacity) {
////        this.capacity = capacity;
////        cache = new LinkedHashMap<>(capacity,0.75f,true){
////            @Override
////            protected boolean removeEldestEntry(Map.Entry entry){
////                return cache.size()>capacity;
////            }
////        };
////    }
////
////    public int get(int key) {
////       return cache.getOrDefault(key,-1);
////    }
////
////    public void put(int key, int value) {
////        cache.put(key,value);
////    }
//
//
//
//
//
//
//


