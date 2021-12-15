package Sword;

public class Sword_47_maxValue {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[row+1][column+1];
        for (int i = 1;i<= row;++i){
            for (int j = 1; j<=column;++j){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + grid[i-1][j-1];
            }
        }
        return dp[row][column];
    }
}

