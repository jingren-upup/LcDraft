package Leetcode;

public class Lc_547_findCircleNum {

    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int res = 0;
        for(int i = 0 ; i<isConnected.length;++i){
            if(visited[i] == 0){
                dfs(isConnected,i,visited);
                res++;
            }
        }

       return res;
    }
    private void  dfs(int[][] isConnected,int x,int[] visted){
        visted[x] = 1;
        for(int j = 0; j < isConnected.length;++j){
            if(isConnected[x][j] == 1 && visted[j] == 0){
                dfs(isConnected,j,visted);
            }
        }

    }
}
