package Amazon;

import java.util.HashMap;
import java.util.Map;

public class AZ_12_minWindow {
    //构建两个k 为char v为整数的map
    /** func1
     * 把t里的的每个字符放进第一个map
     * 左指针为0 右指针为-1
     * 长度为Int max，ansl 和 ansr 为-1
     * while 一个大循环{
     *     r自加
     *     if(如果r<len且第一个map里包含字符) 则 第二个map放进去相应的值
     *     while(check 且l<=r){
     *     if(右减左+1<len)
     *      ans左右值赋值
     *      len = r-l+1
     *       if(左边出现了相应字符) 如果出现则减1
     *       l++;
     *     }
     *  return 如果ansr 为-1返回空 不然返回substring ansl 到 ansr+1
     *
     * }
     *
     * func2 布尔类型的
     * 遍历第一个map
     * 如果出现val小于他 return false
     * 最后return true
     * */

    Map<Character,Integer> map1 = new HashMap<>();
    Map<Character,Integer> map2 = new HashMap<>();
    int len = Integer.MAX_VALUE;
    int ansl = -1, ansr = -1;
    public String minWindow(String s, String t) {

        for (char c:t.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        int l = 0, r = -1;

        while (r<s.length()){
            ++r;
            if (r<s.length()&&map1.containsKey(s.charAt(r))){
                map2.put(s.charAt(r),map2.getOrDefault(s.charAt(r),0)+1);
            }
            while(check()&&l<=r){
                ansr = r;
                ansl = l;
                len = r-l+1;
                if (map1.containsKey(s.charAt(l))){
                    map2.put(s.charAt(l),map2.getOrDefault(s.charAt(l),0)-1);
                }
                ++l;
            }

        }
        return ansr == -1?"":s.substring(ansl,ansr+1);

    }
    public boolean check(){
        for (Map.Entry e:map1.entrySet()){
            int val = (int) e.getValue();
            if (map2.getOrDefault(e.getKey(),0) < val){
                return false;
            }
        }
        return true;
    }

}
