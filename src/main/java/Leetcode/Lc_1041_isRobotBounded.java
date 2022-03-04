package Leetcode;

import java.util.Stack;

public class Lc_1041_isRobotBounded {
    public boolean isRobotBounded(String instructions) {
        int dir =0;
        int x = 0,  y = 0;
        for(char c:instructions.toCharArray()){
            if(c =='L'){
                if(dir ==0)
                    dir = 3;
                else
                    dir--;

            }else if(c == 'R'){
                if(dir ==3)
                    dir = 0;
                else
                    dir++;

            }else{
                switch(dir){
                    case 0: y ++; break;
                    case 1: x ++; break;
                    case 2: y --; break;
                    case 3: x --; break;
                }
            }
        }
        if((x==0 && y==0) || dir!=0)
            return true;
        return false;
    }
}
