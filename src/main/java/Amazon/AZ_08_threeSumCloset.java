package Amazon;

import java.util.*;

public class AZ_08_threeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int res = nums[0] + nums[1] + nums[2];
      for (int i = 0; i < nums.length - 1;++i){
          int l = i+1, r = nums.length - 1;
          while (l<r){
              int sum = nums[i] + nums[l] + nums[r];
              if (Math.abs(target - res) > Math.abs(target - sum)){
                  res = sum;
              }
              if (sum>target){
                  r--;
              }else if(sum<target){
                  l++;
              }else {
                  return  target;
              }
          }
      }
      return res;
    }
}


