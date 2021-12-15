package Sword;

public class Sword_12_exist {
    public boolean exist(char[][] board, String word) {
        char[] wordlist = word.toCharArray();
        for (int i = 0; i <board.length;++i){
            for (int j = 0; j < board[0].length;++j){
                if (dfs(board,i,j,0,wordlist)) return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, int k,char[] words){
        if ((i>board.length - 1||i<0||j<0||j>board[0].length - 1||board[i][j] != words[k])){
            return false;
        }
        if (k == words.length -1){
            return true;
        }
        board[i][j] = '\0';
        boolean res = (dfs(board,i+1,j,k+1,words)||dfs(board,i-1,j,k+1,words)
                      ||dfs(board,i,j+1,k+1,words)||dfs(board,i,j-1,k+1,words));
        board[i][j] = words[k];
        return res;
    }
}
