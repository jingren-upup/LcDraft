package Leetcode;


import java.util.LinkedList;

public class Lc_408_validWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0, k = 0;
        int len1 = word.length();
        int len2 = abbr.length();
        while(i<len1 && j<len2){
            char c = abbr.charAt(j);
            if(c>='a' && c<='z'){
                if(word.charAt(i) != c) return false;
                i++;
                j++;
            }else{
                if(abbr.charAt(j) == '0') return false;
                k = j;
                while(j < len2 && abbr.charAt(j) >='0' && abbr.charAt(j) <= '9'){
                    j++;
                }
                int v = Integer.valueOf(abbr.substring(k,j));
                i += v;
                if(v>len1) return false;
            }
        }
        return  i == len1 && j==len2;
    }

}
