package Amazon;

public class AZ_38_exist {
    //row of the board
    int row;
    //columns of the board
    int col;
    //string to wordlist
    char[] wordlist;
    //visited or not
    boolean[][] visited;
    //length of the string
    int len;
    //delta
    int[] deltaX = new int[]{1,-1,0,0};
    int[] deltaY = new int[]{0,0,1,-1};
    //tmp board
    char[][] tmpBoard;

    public boolean exist(char[][] board, String word) {

        wordlist = word.toCharArray();
        row = board.length;
        col = board[0].length;
        visited = new boolean[row][col];
        len = word.length();
        tmpBoard = board;
        for (int i = 0;i<row;++i){
            for (int j = 0;j<col;++j){
                if (dfs(i,j,0)){
                   return true;
                }
            }
        }

        return false;
    }
    private boolean inarea(int i, int j){
        return i>=0 && i<row && j>=0 && j<col;
    }
    private boolean dfs(int x,int y,int begin) {
        //终止条件 如果已经字符串已经满了 返回最后一位的判断
        if (begin == len -1){
            return tmpBoard[x][y] == wordlist[begin];
        }
        if (wordlist[begin] == tmpBoard[x][y]){
            visited[x][y] = true;
            for (int i = 0; i < 4;++i){
                int newx = x + deltaX[i];
                int newy = y + deltaY[i];
                if( inarea(newx,newy) && !visited[newx][newy]){
                    if (dfs(newx,newy,begin+1)){
                        return true;
                    }
                }
            }
            visited[x][y] = false;
        }
        return false;
    }

}