package Leetcode;

public class Lc_153_findMin {
    public int findMin(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int l = 0, r = nums.length - 1;

        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]<nums[mid-1] && mid>0 ){
                return nums[mid];
            }
            if(nums[mid]>nums[l]&&nums[mid]>nums[r]){
                l = mid + 1;
            }else{
                r = mid + 1;
            }
        }
        return nums[r];
    }
}
