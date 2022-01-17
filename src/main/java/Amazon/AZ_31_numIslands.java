package Amazon;

import java.util.LinkedList;
import java.util.Queue;

public class AZ_31_numIslands {
    public int numIslands(char[][] grid) {

        int count = 0;
        for (int i = 0; i < grid.length;++i){
            for (int j = 0; j<grid[0].length;++j){
                if (grid[i][j] == '1'){
                    DFS(grid,i,j);
                    count++;
                }

            }
        }

//        int m = grid.length, n = grid[0].length;
//        int count = 0;
//        for(int i = 0; i < m;++i){
//            for (int j = 0; j<n;++j){
//                if (grid[i][j] == '1'){
//                    BFS(grid,i,j);
//                    count++;
//                }
//
//
//            }
//        }
        return count;

    }
    private void DFS(char[][] grid,int x, int y){
        if (x<0||x>= grid.length||y<0||y>=grid[0].length||grid[x][y] == '0'){
            return;
        }
        grid[x][y] = '0';
        DFS(grid,x+1,y);
        DFS(grid,x-1,y);
        DFS(grid,x,y+1);
        DFS(grid,x,y-1);
    }
    private void BFS(char[][] grid, int x, int y){
        int[] deltaX = new int[]{1,-1,0,0};
        int[] deltaY = new int[]{0,0,1,-1};
        Queue<point> queue = new LinkedList<>();
        point cur = new point(x,y);
        queue.add(cur);
        while(!queue.isEmpty()){
            point temp = queue.poll();
            for(int i = 0; i<4; i++){
                int newX = temp.x+deltaX[i];
                int newY = temp.y + deltaY[i];
                if(isValid(grid,newX,newY) && grid[newX][newY]=='1'){
                    grid[newX][newY] = '0';
                    queue.offer(new point(newX,newY));
                }
            }

        }
    }
    private boolean isValid(char[][] grid, int x, int y){
        int m = grid.length, n = grid[0].length;
        return 0<=x && x<m && 0<=y &&y<n;
    }
}
class point{
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

}
