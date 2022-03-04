package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Lc_252_canAttendMeetings {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0];
//            }
//        });
        for(int i = 0; i<intervals.length;++i){
            if(intervals[i][1]>intervals[i+1][1]){
                return false;
            }
        }
        return true;
    }

}
