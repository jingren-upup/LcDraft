package huawei1020;

import java.util.*;

public class second {

        public static  void main(String args[]){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                String s1= sc.nextLine();
                int m = Integer.parseInt(String.valueOf(s1.charAt(0)));
                String s2 = sc.nextLine();
                s2.replaceAll("\\[","");
                s2.replaceAll("\\]","");
                s2.replaceAll("\\s+","");
                String[] s = s2.split(",");
                int[][] g = new int[s.length/2][2];
                Set<Integer> set = new HashSet<>();
                for(int k=0;k<s.length;k++){
                    set.add(Integer.parseInt(s[k])); }
                for(int i =0;i<s.length/2;i++){
                    g[i][0] = Integer.parseInt(s[i*2]);
                    g[i][1] = Integer.parseInt(s[i*2+1]); }
                int[] res = getResult(m,g,set);

                System.out.print(res[0]);
                System.out.print(" "+res[1]);
            } }
        public static int[] getResult(int a, int[][] g,Set<Integer> s) {
            int m = g.length;
            int n = g[0].length;
            int l = s.size();
            int[] res = new int[2];
            boolean[] isVisite = new boolean[l];
//        List<Integer> res = new ArrayList<>();
            Deque<Integer> deque = new ArrayDeque<Integer>();
            //使用hashset添加节点，避免环的存在
            Set<Integer> s1 = new HashSet<>();
            deque.add(a);
            s1.add(a);
            int count = 0;
            //bfs
            while(!deque.isEmpty()){
                int b = deque.size();
                while(b>0){
                    deque.poll();
                    for(int[] gm:g){
                        if(gm[0]==a&& !s.contains(gm[1])){
                            deque.offer(gm[1]);
                            s.add(gm[1]);}
                        if(s1.size()==l){
                            res[0] = gm[1]; }}}
                //使用一个hashset进行维护，到最后一个点时，即为图中的最长路径}
                count++;}
            //bfs的层数}
            res[1] = count;
            return res;
        }
}

