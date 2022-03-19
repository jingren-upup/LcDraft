package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc_78_subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
//        Arrays.sort(nums);
        backTrack(res,new ArrayList<>(),nums,0);
        return res;
    }
    private void backTrack(List<List<Integer>>list,List<Integer>tmp,int[]nums,int start){
        list.add(new ArrayList<>(tmp));
        for(int i = start;i<nums.length;++i){
            tmp.add(nums[i]);
            backTrack(list,tmp,nums,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
