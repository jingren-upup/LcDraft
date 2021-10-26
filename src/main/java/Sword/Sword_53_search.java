package Sword;

import java.util.HashMap;
import java.util.Map;

public class Sword_53_search {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        int count = 0;

        while(i < j){
            int m = (i+j)/2;
            if(nums[m]<target){
                i = m+1;
            }if (nums[m]>=target){
                j= m;
            }
        }
        while( i<nums.length && nums[i++]==target){
            count++;
        }
        return count;
    }
}
