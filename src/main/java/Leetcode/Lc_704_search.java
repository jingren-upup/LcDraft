package Leetcode;


public class Lc_704_search {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid]>target){
                right--;
            }else{
                left++;
            }
        }
        return -1;
    }
}
