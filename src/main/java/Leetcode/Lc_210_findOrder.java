package Leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class Lc_210_findOrder {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //边界情况
        if(numCourses == 0) return new int[0];
        //入度表
        int[] inDegrees = new int [numCourses];
        //单个课需要被先修次数
        for(int[] p:prerequisites){
            inDegrees[p[0]]++;
        }
        //入度为0的节点队列
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0;i <inDegrees.length;++i){
            if(inDegrees[i] == 0) queue.offer(i);
        }
        //可以学完的课程数量
        int count = 0;
        //可以学完的课程
        int[] res = new int[numCourses];
        while(!queue.isEmpty()){
            int curr = queue.poll();
            //可以学完的课程放入其中
            res[count++] = curr;
            for(int[]p:prerequisites){
                if(p[1] == curr){
                    inDegrees[p[0]]--;
                    //放入表内
                    if (inDegrees[p[0]] == 0) queue.offer(p[0]);
                }

            }
        }
        if (count == numCourses) return res;
        return new int[0];
    }

}
