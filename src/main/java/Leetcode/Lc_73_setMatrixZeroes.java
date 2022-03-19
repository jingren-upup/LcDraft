package Leetcode;

import java.util.*;

public class Lc_73_setMatrixZeroes {
    class Point{
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        int x;
        int y;
    }
    public void setZeroes(int[][] matrix) {
        LinkedList<int[]> list= new LinkedList<>();
        for(int i = 0;i < matrix.length;++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i,j});
                }
            }
        }

        for (int[] tmp :list){
            Arrays.fill(matrix[tmp[0]],0);
            for(int tmpi = 0; tmpi < matrix.length;++tmpi){
                matrix[tmpi][tmp[1]] = 0;
            }
        }

    }
}
