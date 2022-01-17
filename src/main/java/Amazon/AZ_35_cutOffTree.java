//package Amazon;
//
//import java.util.List;
//import java.util.PriorityQueue;
//
//public class AZ_35_cutOffTree {
//    static  int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
//
//    public int cutOffTree(List<List<Integer>> forest) {
//        int count = 0;
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2] - b[2]);
//        if (forest == null||forest.size() == 0) return 0;
//
//        for (int i = 0;i < forest.size();++i){
//            for (int j = 0; j < forest.get(0).size();++j){
//                if (forest.get(i).get(j)>1){
//                    pq.add(new int[]{i,j,forest.get(i).get(j)});
//                }
//
//            }
//        }
//
//        int[] start = new int[2];
//
//        while(!pq.isEmpty()){
//            int[] tree = pq.poll();
//            int step = BFS(forest,start,tree,forest.size(),forest.get(0).size());
//            if (step<0) return -1;
//            count+= step;
//            start[0] = tree[0];
//            start[1] = tree[1];
//        }
//        return count;
//    }
////    private int BFS(List<List<Integer>> forest,int[] start, int[] tree, int m, int n){
////
////    }
//}