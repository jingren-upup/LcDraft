package Leetcode;

import java.util.Stack;

public class Lc_05_longestPalindrome {
    int low, maxlen;
    public String longestPalindrome(String s) {
            //边界情况
            if(s == null || s.length() < 2){
                return s;
            }

            int len = s.length();
            for (int i = 0; i < len -1;++i){
                //奇数情况
                recur(s,i,i);
                //偶数情况
                recur(s,i,i+1);
            }
            //去边
           return s.substring(low,low+maxlen);
    }
    private void recur(String s, int j, int k) {
        //如果范围没出
        while(j>=0 && k<=s.length()-1 && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        //更新最大长度
        if(maxlen<k-j-1){
            //low应该是当前回文数的做左指针 j是左指针的左边界
            low = j+1;
            //更新长度 这个公式应该是(k-1 -(j+1))+1 最后得出的这个公式s
            maxlen = k-j-1;
        }

    }

}
