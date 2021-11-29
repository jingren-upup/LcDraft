package Sword;

public class Sword_42_maxSubArray {
    public int maxSubArray(int[] nums) {
       int max = nums[0];
       int former = 0;
       int cur = nums[0];
       for(int num:nums){
           cur = num;
           if (former>0){
               cur +=former;
           }
           max = Math.max(max,cur);
           former = cur;
       }
       return max;
    }
}
