package Amazon;





import java.util.LinkedList;
import java.util.Queue;

/*
In a checkerboard, there are 2 kinds of chess pieces: one is white and the other one is black.
During each operation, the white chess pieces around the black one will be replaced by black ones.
Count the minimum times of operations until no black chess pieces exist in a given checkerboard.

Example:
x means there is no chess piece at that location, b means black chess piece and w means white chess piece
At first,
x x w x
x x w x
x w b w
x w x w
After the 1st operation
x x w x
x x b x
x b b b
x w x w
After the 2nd operation
x x b x
x x b x
x b b b
x b x b
The result is 2
 */

public class AZ_41_checkerboardBFS {
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }

    }

    public static int checkboradBFS(char[][] grid) {
       int black = 0, steps = 0,total = 0;
       int n = grid.length;
       int m = grid[0].length;
       Queue<Pair> queue = new LinkedList<>();
       for(int i = 0;i <n;++i){
           for (int j = 0; j <m;++j){
               if(grid[i][j] == 'b'){
                   black++;
                   queue.add(new Pair(i,j));
               }
               total++;
           }
       }
       while(queue.size()>0){
           int size = queue.size();
           while(size>0){
               Pair p = queue.poll();
               int x = p.x;
               int y = p.y;
               if (x > 0 && grid[x - 1][y] == 'w') {
                    grid[x-1][y] = 'b';
                    queue.add(new Pair(x-1,y));
                    black++;
               }
               if (x < n-1 && grid[x + 1][y] == 'w') {
                   grid[x+1][y] = 'b';
                   queue.add(new Pair(x+1,y));
                   black++;
               }
               if (y > 0 && grid[x][y-1] == 'w') {
                   grid[x][y-1] = 'b';
                   queue.add(new Pair(x,y-1));
                   black++;
               }
               if (y < m-1 && grid[x][y+1] == 'w') {
                   grid[x][y+1] = 'b';
                   queue.add(new Pair(x,y+1));
                   black++;
               }
               size--;
           }
           steps++;
           if(black == total) return steps;
       }
        if(black == total) return steps;
        else return -1;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'w','w','b'},
                {'w','b','w'},
        };
        System.out.println(checkboradBFS(board));
    }

}