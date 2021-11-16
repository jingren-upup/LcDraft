package Sword;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sword_11_minArray {
    public int findRepeatNumber(int[] numbers) {
       int i = 0, j = numbers.length -1;
       while (i<j){
           int mid =(i+j)/2;
           // 在右半部分区间
           if (numbers[mid]>numbers[j]){
               i= mid+1;

           }
           //在 左半部分区间
           else if(numbers[mid]<numbers[j]){
               j = mid;
           }//无法判定在哪个区间 安全缩小区间
           else{
               --j;
           }
       }
       return numbers[i];
    }
}
