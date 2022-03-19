package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class Lc_113_pathSum {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root,targetSum,res,list);
        return res;
    }
    private void dfs(TreeNode node, int remain,  List<List<Integer>> res,List<Integer>list ){
        if(node == null) return;
        list.add(node.val);
        if(node.left == null && node.right ==null&&remain == node.val){
            res.add(new ArrayList<>(list));
        }else{
            dfs(node.left, remain-node.val, res, list);
            dfs(node.right, remain-node.val, res, list);
        }
        //pop last one
        list.remove(list.size()-1);
    }



}