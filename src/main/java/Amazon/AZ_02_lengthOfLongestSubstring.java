package Amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class AZ_02_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s.length()== 0){
            return max;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0, j =0; i<s.length();++i){
            if (map.containsKey(s.charAt(i))){
               j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

}
