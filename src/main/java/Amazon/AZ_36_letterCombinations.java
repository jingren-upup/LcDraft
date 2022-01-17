package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AZ_36_letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        HashMap<Character,char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r','s'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y','z'});
        dfs(res,0,new StringBuilder(),map,digits);
        return res;
    }
    private void dfs(List<String>res,int index,StringBuilder sb,HashMap<Character,char[]> map,String digits){

        if (index == digits.length()){
            res.add(sb.toString());
            return;
        }

        char[] tmp = map.get(digits.charAt(index));
        for (int i = 0; i < tmp.length;++i){
            sb.append(tmp[i]);
            dfs(res, index+1, sb, map, digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}