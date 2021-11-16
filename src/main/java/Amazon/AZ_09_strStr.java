package Amazon;

public class AZ_09_strStr {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (n == 0 && m == 0){
            return 0;
        }
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        for (int i = 0; i <= n - m; ++i) {
            int j = i, k = 0;
            while (k < m &&a[j] == b[k] ) {
                ++j;
                ++k;
            }
            if( k == m){
                return i;
            }
        }
        return  -1;
    }
}
