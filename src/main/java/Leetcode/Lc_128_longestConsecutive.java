package Leetcode;


import java.util.Arrays;

public class Lc_128_longestConsecutive {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        int combo = 0;
        for (int i = 0, j = 1;j<nums.length;++i,++j){

            if(nums[i]+1 == nums[j]){
                combo++;
                res = Math.max(res,combo+1);
            }else if (nums[i] == nums[j]){
                continue;
            }else{
                combo = 0;
                continue;
            }
        }
        return res;
    }
}
