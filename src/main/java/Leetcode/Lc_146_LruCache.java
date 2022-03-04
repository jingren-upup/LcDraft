package Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lc_146_LruCache {
//    int capacity;
//    LinkedHashMap<Integer,Integer> cache;
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        cache = new LinkedHashMap<>(capacity,0.75f,true){
//            @Override
//            protected boolean removeEldestEntry(Map.Entry entry){
//                return cache.size()>capacity;
//            }
//        };
//    }
//
//    public int get(int key) {
//       return cache.getOrDefault(key,-1);
//    }
//
//    public void put(int key, int value) {
//        cache.put(key,value);
//    }







}

//    int capacity;
//    LinkedHashMap<Integer, Integer> cache;
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
//            @Override
//            protected boolean removeEldestEntry(Map.Entry eldest) {
//                return cache.size() > capacity;
//            }
//        };
//    }
//
//    public int get(int key) {
//        return cache.getOrDefault(key, -1);
//    }
//
//    public void put(int key, int value) {
//        cache.put(key, value);
//    }