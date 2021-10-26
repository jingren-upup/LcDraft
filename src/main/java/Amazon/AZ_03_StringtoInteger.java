package Amazon;

public class AZ_03_StringtoInteger {
    public int myAtoi(String s) {

        int sign = 1,i = 0,r = 0;
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        else if(s.charAt(i) == '-'){
            sign = -1;
            ++i;
        }
        else if (s.charAt(i) == '+'){
            ++i;
        }
       while (i<s.length() && Character.isDigit(s.charAt(i))){
           int tmp = s.charAt(i) - '0';
           if(r > (Integer.MAX_VALUE - tmp)/10){
               return sign > 0 ? Integer.MAX_VALUE :Integer.MIN_VALUE;
           }
           r = r * 10 +tmp;
           ++i;
       }
       return r * sign;
    }
}
