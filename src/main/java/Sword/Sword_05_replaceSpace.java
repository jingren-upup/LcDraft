package Sword;

public class Sword_05_replaceSpace {
    public String replaceSpace(String s){
        StringBuilder sb = new StringBuilder();
        for (Character ch: s.toCharArray()){
            if (ch == ' '){
                sb.append("%20");
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
