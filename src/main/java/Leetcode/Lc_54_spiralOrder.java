package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class Lc_54_spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        //上边界
        int top = 0;
        //下边界
        int bottom = matrix.length -1;
        //左边界
        int left = 0;
        //右边界
        int right = matrix[0].length -1;
        while(true){

            for(int i = left; i <= right;++i) res.add(matrix[top][i]);
            top++;
            if(left>right||top>bottom) break;
            for(int i = top; i <= bottom;++i) res.add(matrix[i][right]);
            right--;
            if(left>right||top>bottom) break;
            for(int i = right; i >= left;--i) res.add(matrix[bottom][i]);
            bottom--;
            if(left>right||top>bottom) break;
            for(int i = bottom; i >= top;--i) res.add(matrix[i][left]);
            left++;
            if(left>right||top>bottom) break;

        }
        return res;
    }
}
