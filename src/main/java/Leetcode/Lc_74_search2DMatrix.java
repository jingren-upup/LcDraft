package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class Lc_74_search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int i = 0, j = row*col-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(matrix[mid/col][mid%col]==target) return true;
            else if(matrix[mid/col][mid%col]>target){
                j = mid -1;
            }else{
                i = mid+1;
            }
        }
        return false;
    }

}
