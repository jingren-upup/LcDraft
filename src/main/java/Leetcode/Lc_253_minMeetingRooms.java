package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Lc_253_minMeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));

        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        int rooms = 0;
        int endItr = 0;

        for(int i=0;i<intervals.length;++i){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        for(int i = 0; i<intervals.length;++i){
              if(starts[i]<ends[endItr]){
                    rooms++;
              }else{
                    endItr++;
              }
        }
        return rooms;
    }

}
