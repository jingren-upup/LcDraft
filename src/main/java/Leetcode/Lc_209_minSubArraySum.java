package Leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class Lc_209_minSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, from = 0, res = Integer.MAX_VALUE;
        //keep a slide window, and make it shorter and shorter
        for(int i  = 0; i < nums.length;++i){
            sum += nums[i];
            while(sum>=target){
                res = Math.min(res,i-from+1);
                sum -= nums[from];
                from++;
            }
        }
        return res == Integer.MAX_VALUE?0:res;
    }

    public static void main(String[] args) {
        Lc_209_minSubArraySum test = new Lc_209_minSubArraySum();
        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(test.minSubArrayLen(target,nums));
    }
}
