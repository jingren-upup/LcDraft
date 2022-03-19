package Leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lc_98_isValidBST {
    public boolean isValidBST(TreeNode root) {
        return  dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean dfs(TreeNode node,long lower,long higher){
        if(node == null) return true;
        if(lower>=node.val||higher<=node.val) return false;
        return dfs(node.left,lower,node.val)&&dfs(node.right,node.val,higher);
    }

}
