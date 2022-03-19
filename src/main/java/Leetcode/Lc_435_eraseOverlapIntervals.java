package Leetcode;


import java.util.Arrays;
import java.util.LinkedList;

public class Lc_435_eraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int res = 0;
        int preend = intervals[0][1];
        for(int i = 1; i <intervals.length;++i){
            if(preend>intervals[i][0]){
                res++;
                preend = Math.min(intervals[i][1],preend);
            }else{
                preend = intervals[i][1];
            }

        }

        return res;
    }
}
