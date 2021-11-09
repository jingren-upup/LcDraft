package Amazon;

import java.util.HashMap;
import java.util.Map;

public class AZ_04_maxArea {
    public int maxArea(int[] height) {
       int left =0, right = height.length-1;
       int result = 0;
       while(left<right){
           result = Math.max(result,Math.min(height[left],height[right])*(right-left));
           if (height[left]<height[right]){
               left++;
           }else {
               right--;
           }
       }
       return result;

    }

}
