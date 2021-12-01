package Amazon;

import java.util.*;


public class AZ_19_mostCommonWord {
    public String mostCommonWord(String p, String[] banned) {
        Set<String> banList = new HashSet<>(Arrays.asList(banned));
        Map<String,Integer> count = new HashMap<>();
        String[] words = p.replaceAll("\\W+" , " ").toLowerCase().split(" ");
        for (String w : words){
            if (!banList.contains(w)) {
                count.put(w, count.getOrDefault(w, 0) + 1);
            }
        }
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
