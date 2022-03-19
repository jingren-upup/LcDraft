package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class Lc_543_diameterOfBinaryTree {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        dfs(root);
        int[] tmp = new int[]{1,23,3};
        return res;

    }
    private int dfs(TreeNode root){
        if (root.left == null && root.right == null){
            return 0;
        }
        int leftsize = root.left == null?0:dfs(root.left)+1;
        int rightsize = root.right == null?0:dfs(root.right)+1;
        res = Math.max(leftsize+rightsize,res);
        return Math.max(leftsize,rightsize);
    }
}
