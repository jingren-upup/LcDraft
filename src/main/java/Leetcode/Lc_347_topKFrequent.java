package Leetcode;

import java.util.*;

public class Lc_347_topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];


        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
            }
        }
        while (k>0){
            for (Map.Entry<Integer,Integer> entry: map.entrySet()){
                if (entry.getValue() == max){
                    res[k-1] = entry.getKey();
                    k--;
                }

            }
            max--;
        }
        return res;
    }


}
