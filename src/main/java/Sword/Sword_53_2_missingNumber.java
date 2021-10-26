package Sword;

public class Sword_53_2_missingNumber {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length-1;
        while(i<=j){
            int m = (i+j)/2;
            if (nums[m]==m){
                i=m+1;
            }else {
                j--;
            }

        }
        return i;

    }
}
