package Leetcode;


public class Lc_124_maxPathSumInBinaryTree {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }
    private int dfs(TreeNode root){
        int max = 0;
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        res = Math.max(res,root.val+left+right);
        max = Math.max(root.val+left,root.val+right);
        return max>0?max:0;
    }
}
