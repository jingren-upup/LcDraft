package Sword;

import java.util.HashSet;
import java.util.Set;

public class Sword_04_findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }
        int j = matrix[0].length-1,i = 0;
        while (j>=0 && i < matrix.length){
            if (matrix[i][j]>target){
                j--;
            }else if (matrix[i][j]<target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
