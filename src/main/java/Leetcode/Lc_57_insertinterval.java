package Leetcode;


import java.util.Arrays;
import java.util.LinkedList;

public class Lc_57_insertinterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]>list = new LinkedList<>();

        for(int[]interval:intervals){
            //can contain the start edge of new or not
            if(newInterval == null || interval[1]<newInterval[0]){
                list.add(interval);
            }
            //can contain the end edge of new or not
            else if(interval[0]>newInterval[1]){
                list.add(newInterval);
                list.add(interval);
                newInterval = null;
            }else{
                //merge edge
                newInterval[0] = Math.min(interval[0],newInterval[0]);
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
        }
        //last one
        if(newInterval!=null) list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }
}
