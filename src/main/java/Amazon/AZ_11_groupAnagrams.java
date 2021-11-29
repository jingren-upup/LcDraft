package Amazon;

import java.util.*;

public class AZ_11_groupAnagrams {
    //新建map map 里的key 是String，value 是list 里头装string
    //挨个循环遍历string 然后字符串转化成char类型
    //字符串排序
    //新建一个字符串list 查询该值，如果没有，则default放入新的值
    //list加入该str
    //放入map里
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for (String str:strs){
           char [] ary =  str.toCharArray();
            Arrays.sort(ary);
            String key = new String(ary);
            List list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map. values());
    }
}
