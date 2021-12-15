package Sword;

public class Sword_57_twoSum {
    public int[] twoSum(int[] nums,int target) {
      int len = nums.length;
      int i = 0, j = len-1;
      while (i<j){
        if (nums[i]+nums[j]>target){
            --j;
        }else if (nums[i]+nums[j]<target){
            ++i;
        }else {
            return new int[]{nums[i],nums[j]};
        }

      }
      return null;
    }
}
