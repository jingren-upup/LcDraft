package Sword;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class Sword_58_1_reverseWords {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length -1; i >=0;--i){
            if (str[i].equals("")){
                continue;
            }
            sb.append(str[i]+" ");
        }
        return sb.toString().trim();
    }
    }

