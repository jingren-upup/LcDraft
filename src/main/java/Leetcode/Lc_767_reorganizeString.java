package Leetcode;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Lc_767_reorganizeString {
    public String reorganizeString(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }


        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        maxHeap.addAll(map.entrySet());
        StringBuilder res = new StringBuilder();
        Map.Entry<Character,Integer> prev = null;
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> cur = maxHeap.poll();
            res.append(cur.getKey());
            cur.setValue(cur.getValue()-1);
            if (prev != null) maxHeap.offer(prev);
            if (cur.getValue()>0)
                prev = cur;
            else
                prev = null;
        }
        return res.length() == s.length()? res.toString():"";
    }
}
