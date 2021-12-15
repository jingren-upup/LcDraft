package Sword;

public class Sword_13_movingCount {
    int m, n , k;
    boolean[][] visted;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        //全局变量命名二维数组
        this.visted = new boolean[m][n];
        return dfs(0,0,0,0);
    }
    public int dfs(int i, int j, int si,int sj){
        //判断条件
        if (i>=m||j>=n||k<si+sj||visted[i][j]){
            return 0;
        }
        visted[i][j] = true;
        //si sj是目前两位相加总和 如果 进位 那么总和就少了8 如果不进位 那么就是普通加一
        return dfs(i+1,j,(i+1)%10 != 0?si+1:si-8,sj)+dfs(i,j+1,si,(j+1)%10 != 0?sj+1:sj-8)+1;
    }
}
