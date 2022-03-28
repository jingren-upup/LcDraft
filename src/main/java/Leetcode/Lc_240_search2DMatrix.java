package Leetcode;


public class Lc_240_search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length , col = matrix[0].length;
        if(matrix == null|| row == 0||col == 0) return false;
        int i = 0, j = col-1;
        while(i<=row-1&&j>=0){
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
