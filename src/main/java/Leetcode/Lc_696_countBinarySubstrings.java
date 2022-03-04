package Leetcode;

import java.util.Stack;

public class Lc_696_countBinarySubstrings {
    public int countBinarySubstringss(String s) {
       int pointer = 0, n = s.length(),last = 0, res = 0;
       while(pointer<n){
           char c =s.charAt(pointer);
           int count = 0;
           while(pointer<n && s.charAt(pointer) == c){
               ++pointer;
               ++count;
           }
           res += Math.min(count,last);
           last = count;
       }
       return res;
    }
}
