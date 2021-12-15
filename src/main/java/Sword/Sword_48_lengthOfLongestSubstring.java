package Sword;

import java.util.HashMap;
import java.util.Map;

//pwwkew为例子
//

public class Sword_48_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //判断是否为空
        if (s.length() == 0){
            return 0;
        }
        //结果
        int num = 0;
        //字符串起始位置
        int start = 0;
        //每个字符以及以及最近一次坐标
        Map<Character,Integer> map = new HashMap<>();
        for(int end = 0;end<s.length();++end){
            //当前字符
            char str = s.charAt(end);
            if (map.containsKey(str)){
                //如果有字符 更新位置
                start = Math.max(map.get(str),start);
                //start = map.get(str);
            }
            //更新长度
            num = Math.max(num,end-start+1);
            //放入最新结果
            map.put(str,end+1);
        }
        return num;
    }
}

