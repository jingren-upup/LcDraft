package Leetcode;


import java.util.LinkedList;
import java.util.Random;

public class Lc_384_shuffleArray {
    int[] nums;
    int n;
    Random random = new Random();
//    public Solution(int[] num_s) {
//      nums = num_s;
//      n = nums.length;
//    }
    public int[] reset() {
     return nums;
    }
    public int[] shuffle() {
       int[] ans = nums.clone();
       for(int i = 0; i < n;++i){
           swap(ans,i,i+random.nextInt(n-i));
       }
       return ans;
    }
    void swap(int[] arr, int i, int j) {
     int tmp = arr[i];
     arr[i] = arr[j];
     arr[j] = tmp;
    }



}
