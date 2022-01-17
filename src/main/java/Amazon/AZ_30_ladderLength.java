package Amazon;



import java.util.*;

public class AZ_30_ladderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int count = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0;i <size;++i){
                char[] cur = queue.poll().toCharArray();
                for (int j = 0;j<cur.length;++j){
                    char tmp = cur[j];
                    for (char c = 'a';c<='z';++c){
                        cur[j] = c;
                        String next = new String(cur);
                        if (set.contains(next)){
                            //终止条件
                            if (next.equals(endWord)){
                                return ++count;
                            }
                            //队列元素添加
                            queue.add(next);
                            //去重
                            set.remove(next);
                        }

                    }
                    //复原
                    cur[j] = tmp;
                }
            }
            count++;
        }
        return 0;
    }
}

