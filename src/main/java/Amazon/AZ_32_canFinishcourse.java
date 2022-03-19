package Amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AZ_32_canFinishcourse {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //create adj
        List<List<Integer>> adj = new ArrayList<>();
        //track way
        //新建flags 1 是当前走过路 如果有1说明构成了有环图
        //-1是之前其他节点启动走过的路 如果有-1可以立马返回true 因为不需要在访问了
        int[] flags = new int[numCourses];
        //put each array
        for(int i=0; i < numCourses;++i){
            adj.add(new ArrayList<>());
        }
        //assign courses
        for(int cp[]:prerequisites){
            adj.get(cp[1]).add(cp[0]);
        }
        //find any circle
        for(int i= 0 ; i < numCourses;++i){
            if(!DFS(adj,flags,i)){
                return false;
            }
        }
        return true;
    }
    private boolean DFS(List<List<Integer>> adj, int[] flags,int i){
        //not a acyclic
        if(flags[i] == 1) return false;
        //is a acyclic
        if(flags[i] == -1) return true;
        flags[i] = 1;
        //continue dfs
        for(Integer j:adj.get(i)){
            if(!DFS(adj,flags,j)){
                return false;
            }
        }
        //recover flag
        flags[i] = -1;
        return true;
    }

}