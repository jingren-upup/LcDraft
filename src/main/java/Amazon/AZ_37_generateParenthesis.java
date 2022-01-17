package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class AZ_37_generateParenthesis {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        int right = n, left = n;

        dfs(right,left,new StringBuilder());
        return  res;
    }
    private void dfs(int right,int left,StringBuilder sb) {
        if (right == 0 && left == 0){
            res.add(sb.toString());
            return;
        }
        if (left>0){
            dfs(right,left-1, new StringBuilder(sb + "("));
        }
        if (right>left){
            dfs(right-1,left, new StringBuilder(sb + ")"));

        }

    }

}