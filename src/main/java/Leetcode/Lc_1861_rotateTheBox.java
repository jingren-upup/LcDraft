package Leetcode;

import java.util.Stack;

public class Lc_1861_rotateTheBox {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int column = box[0].length;
        char[][] ans = new char[column][row];
        for(int i = 0;i < row;++i){
            int pos = column - 1;
            for(int j = column -1; j >= 0;--j){

                if(box[i][j] == '*'){
                     pos = j - 1;
                }
                if(box[i][j] == '#'){
                    box[i][j] = '.';
                    box[i][pos] = '#';
                    --pos;
                }

            }
        }
        for(int i = 0; i<row;++i){
            for(int j = column -1;j >=0;--j){
                ans[j][row - i - 1] = box[i][j];

            }
        }
        return ans;
    }
}
