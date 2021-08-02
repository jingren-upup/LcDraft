package Leetcode;


public class Lc_46_jump {
    public int jump(int[] nums) {
        int end = 0;
        int steps = 0;
        int maxPos = 0;
        for (int i =0; i<nums.length -1;i++){
            maxPos = Math.max(nums[i] + i,maxPos);
            if (i == end) {
                end = maxPos;
                steps++;
            }
        }
        return steps;
    }
}
