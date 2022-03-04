package Leetcode;

public class Lc_791_customSortString {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        //record times
        char[] data = new char[26];
        for(char c:s.toCharArray()){
            data[ c-'a']++;
        }
        //put in
        for(char c:order.toCharArray()){
            if(data[c-'a']!=0){
                for(int i = 0; i < data[c-'a'];++i){
                    sb.append(c);
                }
                data[c-'a'] = 0;
            }
        }
        //if not exist in order
        for(int i = 0;  i < data.length;++i){
            while(data[i]!=0){
                sb.append((char)('a'+i));
                data[i]--;
            }
        }
    return sb.toString();
    }
}
