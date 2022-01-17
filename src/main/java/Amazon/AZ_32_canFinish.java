package Amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AZ_32_canFinish{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //新建临接图
        List<List<Integer>> adj = new ArrayList<>();
        //新建flags 1 是当前走过路 如果有1说明构成了有环图
        //-1是之前其他节点启动走过的路 如果有-1可以立马返回true 因为不需要在访问了
        int[] flags = new int[numCourses];
        //添加对应课程数的数组链表
        for (int i = 0; i < numCourses;++i){
            adj.add(new ArrayList<>());
        }
        //构建邻接图
        for(int[] cp:prerequisites){
            adj.get(cp[1]).add(cp[0]);
        }
        //遍历DFS
        for (int i = 0; i<numCourses;++i){
            //如果有环立马run
            if (!DFS(adj,flags,i)){
                return false;
            }
        }
        return  true;
    }
    private boolean DFS(List<List<Integer>> adj, int[] flags, int i) {
        //有环
        if (flags[i] == 1) return false;
        //无环
        if (flags[i] == -1) return true;
        //走过标记
        flags[i] = 1;
        //继续走下去连接到东西
        for (Integer j:adj.get(i)){
            if (!DFS(adj,flags,j)) return false;
        }
        //退出之前埋个标记代表走过
        flags[i] = -1;
        return true;
    }
}