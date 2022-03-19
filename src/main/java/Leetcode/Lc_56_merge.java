package Leetcode;


import com.kenai.jaffl.annotations.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lc_56_merge {
    public int[][] merge(int[][] intervals) {
        //sort by first index
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        //create a linkedlist
        LinkedList<int[]> res = new LinkedList<>();
        //merge interval
        for(int[] interval:intervals){
            //if no overlap, add it
            if(res.isEmpty()||res.getLast()[1]<interval[0]){
                res.add(interval);
            }else{
                //have overlap, compare max
                res.getLast()[1] = Math.max(res.getLast()[1],interval[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
