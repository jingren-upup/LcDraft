package Amazon;

import java.util.*;

public class AZ_11_groupAnagrams {
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
