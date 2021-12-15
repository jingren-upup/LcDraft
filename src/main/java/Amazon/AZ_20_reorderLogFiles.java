package Amazon;

import java.util.*;


public class AZ_20_reorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int s1 = o1.indexOf(' ');
                int s2 = o2.indexOf(' ');
                char s1first = o1.charAt(s1+1);
                char s2first = o2.charAt(s2+1);
                if (s1first<='9'){
                    if (s2first<= '9'){
                        return 0;
                    }else {
                        return 1;
                    }
                }
                if (s2first<='9'){
                    return -1;
                }
                int pre = o1.substring(s1+1).compareTo(o2.substring(s2+1));
                if (pre == 0){
                    return o1.substring(0,s1).compareTo(o2.substring(0,s2));
                }
                   return pre;

            }
        };
        Arrays.sort(logs,myComp);
        return logs;

    }

}
