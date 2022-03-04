package Leetcode;


import java.util.*;

public class Lc_380_RandomizedSet {
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    Random random = new Random();

//    public RandomizedSet() {
//
//
//    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int idx = map.get(val);
        int last = list.get(list.size()-1);
        list.set(idx,last);
        list.remove(list.size()-1);
        map.put(last,idx);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }



}
