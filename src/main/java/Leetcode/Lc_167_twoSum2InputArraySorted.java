package Leetcode;

public class Lc_167_twoSum2InputArraySorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target) return new int[]{left+1,right+1};
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
}
