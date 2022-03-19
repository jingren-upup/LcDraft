package Leetcode;

public class Lc_70_climbStairs {
    public int climbStairs(int n) {
        int[]res = new int[n];
        if(n<2) return 1;
        res[0] = 1;
        res[1] = 2;
        for(int i = 2; i < n;++i){
            res[i] = res[i-1]+res[i-2];
        }
        return res[n-1];
    }
}
