package Leetcode;

import java.util.Stack;

public class Lc_05_longestPalindrome {

    public String longestPalindrome(String s) {
            if(s == null || s.length() == 0){
                return "";
            }
            int left = 0;
            int right = 0;

            int length = s.length();

            int len = 1;
            int maxLen = 0;
            int maxStart = 0;

            for (int i = 0; i<length; i++){
                left = i-1;
                right = i+1;
                while (left >=0 && s.charAt(i) == s.charAt(left)){
                    left--;
                    len++;
                }
                while (right < length && s.charAt(i) == s.charAt(right)){
                    right++;
                    len++;
                }
                while (left >= 0 && right <=length && s.charAt(right) == s.charAt(left)){
                    len = len + 2;
                    left --;
                     right ++;
                }
                if (len > maxLen){
                    maxLen = len;
                    maxStart = left;
                }
                len = 1;
            }
            return s.substring(maxStart+1, maxStart+maxLen+1);



    }

}
