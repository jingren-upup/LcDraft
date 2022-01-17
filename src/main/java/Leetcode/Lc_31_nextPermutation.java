package Leetcode;


import java.util.HashMap;
import java.util.Map;

public class Lc_31_nextPermutation {

    public void nextPermutation(int[] nums) {
        //为空返回
        if (nums == null||nums.length <=1){
            return;
        }

        //第一index 初始化 倒数第二小
        int index1 = -1;
        //寻找倒数第二小的index
        for (int i = nums.length - 2;i>=0;--i){
            //只要存在上一位比这这一位大
            if(nums[i+1]>nums[i]){
                index1 = i;
                break;
            }
        }
        //如果不变的话直接翻转
        if (index1 == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        //第二index初始化 倒数第三小
        int index2 = -1;
        for(int i =nums.length -1;i>=0;--i){
            if (nums[i]>nums[index1]){
                index2 = i;
                break;
            }

        }
        //交换位置
        swap(nums,index1,index2);
        //倒转
        reverse(nums,index1+1,nums.length-1);
    }
    public void reverse(int[]nums,int i,int j){
        //翻转
        while(i<j){
            swap(nums,i++,j--);
        }

    }
    public void swap(int[] nums,int i, int i1){
        int tmp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = tmp;

    }
}
