package Leetcode;


import java.util.HashMap;
import java.util.LinkedList;

public class Lc_395_sdecodeString {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c == '['){
                stack_multi.addLast(multi);
                stack_res.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            }else if(c ==']'){
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stack_multi.removeLast();
                for (int i = 0; i<cur_multi;++i) tmp.append(res);
                res = new StringBuilder(stack_res.removeLast() + tmp);
            }else if(c>='0' && c<='9'){
                multi = multi*10 + Integer.parseInt(c + "");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }

}
