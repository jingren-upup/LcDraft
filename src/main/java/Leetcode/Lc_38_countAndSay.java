package Leetcode;


public class Lc_38_countAndSay {

    public String countAndSay(int n) {
        String ans = "1";
        for (int i = 2; i <=n;++i){
            String cur = "";
            int m = ans.length();
            for(int j = 0; j < m;){
                int k = j +1;
                while(k<n && ans.charAt(j) == ans.charAt(k)) ++k;
                int cnt = k - j;
                cur += cnt + "" + ans.charAt(j);
                j = k;
            }
            ans = cur;
        }
        return ans;
    }
}
