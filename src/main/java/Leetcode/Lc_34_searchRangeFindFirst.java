package Leetcode;


import java.util.HashSet;
import java.util.Set;

public class Lc_34_searchRangeFindFirst {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = leftIndex(nums,target);
        res[1] = rightIndex(nums,target);
        return res;
    }
    private int leftIndex(int nums[],int target){
        int idx = -1;
        int start = 0;
        int end = nums.length -1;
        while (start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>=target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            if(nums[mid] == target) idx = mid;
        }
        return idx;
    }
    private int rightIndex(int nums[],int target){
        int idx = -1;
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]<=target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            if(nums[mid] == target) idx = mid;
        }

        return idx;
    }
}
