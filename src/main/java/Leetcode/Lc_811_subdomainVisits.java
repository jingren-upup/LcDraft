package Leetcode;

import org.yecht.Data;

import java.util.*;

public class Lc_811_subdomainVisits {

    public List<String> subdomainVisits(String[] cpdomains) {
        //新建map
        Map<String,Integer> count = new HashMap<>();
        //for循环遍历
        for (String cd : cpdomains) {
            int i = cd.indexOf(' ');
            int n = Integer.valueOf(cd.substring(0, i));
            String s = cd.substring(i + 1);
            for (i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '.') {
                    String d = s.substring(i + 1);
                    count.put(d, count.getOrDefault(d, 0) + n);
                }
            }
            count.put(s, count.getOrDefault(s, 0) + n);
        }

        //找出空格
            //转换n
            //切割出后半部分
            //for循环遍历
                //如果有点
                //把剩下域名放到map 用or default
            //放count
        //新建list
        List<String> res = new ArrayList<>();
        for(String d:count.keySet()) res.add(count.get(d)+" " + d);
        //for遍历key set
        return res;
    }

}
