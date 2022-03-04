package Leetcode;

import java.util.Stack;

public class Lc_20_isValid {
    public boolean isValid(String s) {
        if(s.length() == 0){
            return true;
        }
        Stack<Character>stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            }else if (c=='('){
                stack.push(')');
            }else if(c =='['){
                stack.push(']');
            }else{
                if(stack.isEmpty() || c !=stack.pop()){
                    return false;
                }

            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

}
