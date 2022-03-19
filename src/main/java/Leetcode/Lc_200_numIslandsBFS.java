package Leetcode;


import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int x;
    int y;

    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class Lc_200_numIslandsBFS {

        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            int nr = grid.length;
            int nc = grid[0].length;
            int num_islands = 0;
            for (int r = 0; r < nr; ++r) {
                for (int c = 0; c < nc; ++c) {
                    if (grid[r][c] == '1') {
                        ++num_islands;
                        grid[r][c] = '0'; // mark as visited
                        Queue<Pair> quque = new LinkedList<>();
                        quque.add(new Pair(r,c));
                        while (!quque.isEmpty()) {
                             Pair point = quque.poll();
                             int x = point.x;
                             int y = point.y;
                            if (x - 1 >= 0 && grid[x-1][y] == '1') {
                                quque.add(new Pair(x-1,y));
                                grid[x-1][y] = '0';
                            }
                            if (x + 1 < nr && grid[x+1][y] == '1') {
                                quque.add(new Pair(x+1,y));
                                grid[x+1][y] = '0';
                            }
                            if (y - 1 >= 0 && grid[x][y-1] == '1') {
                                quque.add(new Pair(x,y-1));
                                grid[x][y-1] = '0';
                            }
                            if (y + 1 < nc && grid[x][y+1] == '1') {
                                quque.add(new Pair(x,y+1));
                                grid[x][y+1] = '0';
                            }
                        }
                    }
                }
            }

            return num_islands;
        }


}
