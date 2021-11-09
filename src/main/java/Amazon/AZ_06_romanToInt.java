package Amazon;

import java.util.HashMap;

public class AZ_06_romanToInt {
    public int romanToInt(String s) {
        if (s.length() ==0 || s == null){
            return  -1;
        }
        int res = 0 ;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        res = map.get(s.charAt(s.length()-1));
        int len = s.length();
        for (int i = len-2;i>=0;--i) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))
            {
                res += map.get(s.charAt(i));
            }else
            {
                res -= map.get(s.charAt(i));
            }
        }
        return res;
    }
}
