package Leetcode;

public class Lc_81_searchinRotated {
    public boolean search(int[] nums, int target) {
            int l = 0, r = nums.length-1;

            while(l<=r){
                int mid = (l+r)/2;
                if(nums[mid]==target){
                    return true;
                }else if(nums[mid]<nums[r]){
                    if(nums[mid]<target&&target<=nums[r]){
                        l=mid+1;
                    }else{
                        r=mid-1;
                    }
                }else if(nums[mid]>nums[r]){
                    if(nums[l]<=target&&target<nums[mid]){
                        r=mid-1;
                    }else{
                        l=mid+1;
                    }
                }else{
                    r--;
                }
            }
            return false;
    }
}
