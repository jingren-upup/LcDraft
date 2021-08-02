package Sword;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sword_38_permutation {
    public String[] permutation(String s) {
        Set<String> set = new HashSet<>();
        dfs(s.toCharArray(),"",new boolean[s.length()] , set);
        return set.toArray(new String[set.size()]);
    }
    public void dfs(char[] chars, String temp, boolean[] visited, Set<String> set){
        if(temp.length()==chars.length){
            set.add(temp);
            return;
        }

        for(int i=0;i<chars.length;i++){
            if(visited[i]==true) continue;
            visited[i]=true;
            dfs(chars,temp+chars[i],visited,set);
            visited[i]=false;
        }

    }
}
