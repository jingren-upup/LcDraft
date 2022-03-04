package Leetcode;

public class Lc_1312_minInsertions {
    public int minInsertions(String s) {
        int len = s.length();
        int[][]dp = new int[len][len];
        for (int i = len -1; i>=0;--i){
            for (int j = i+1; j < len;++j){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j-1])+1;
                }

            }
        }
        return dp[0][len-1];
    }
}
