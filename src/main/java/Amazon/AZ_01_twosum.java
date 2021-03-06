package Amazon;

import java.util.HashMap;

public class AZ_01_twosum {
    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;++i){
            if (map.containsKey(target - nums[i])){
               return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
      return res;
    }

}
