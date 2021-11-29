package Amazon;

import java.util.HashMap;
import java.util.Map;

public class AZ_14_productExceptSelf {

    public int[] productExceptSelf(int[]nums) {
        int[] res = new int[nums.length];
        //left pointer right pointer
        int q = 1, p= 1;
        //from left to right
        for (int i = 0; i < nums.length;++i){
            //update
            res[i] = q;
            //go next
            q *= nums[i];
        }
        //from right to left
        //因为是从右往左 回存在 先移动指针再更新值的情况
        //并且该指针移动时需要注意index 0的情况 所以右边界不为包含 为开区间
        for (int i = nums.length -1; i>0;--i){
            //go next
            p *= nums[i];
            //update
            res[i-1] *= p;
        }
        return res;
    }
}
