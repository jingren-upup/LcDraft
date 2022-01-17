package Leetcode;


import java.util.HashMap;

public class Lc_560_subarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> preSumCount = new HashMap<>();
        int presum = 0;
        preSumCount.put(0,1);

        for (int i = 0; i< nums.length;++i){
            presum += nums[i];
            //此时nums[i] 正好是多余的部分 然后收集之前的部分
            if (preSumCount.containsKey(presum - k)){
                count += preSumCount.get(presum - k);
            }
        preSumCount.put(presum,preSumCount.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
