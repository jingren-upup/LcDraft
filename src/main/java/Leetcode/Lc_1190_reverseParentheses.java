package Leetcode;

import java.util.Stack;

public class Lc_1190_reverseParentheses {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length();++i){
            if(s.charAt(i) == '('){
                stack.push(sb.toString());
                sb.delete(0,i);
            }else if (s.charAt(i) ==')'){
                sb.reverse();
                sb.insert(0,stack.pop());
            }else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
