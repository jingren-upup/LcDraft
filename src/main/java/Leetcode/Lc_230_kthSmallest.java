package Leetcode;


public class Lc_230_kthSmallest {
    int count = 0;
    int number = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        dfs(root);
        return number;
    }
    private void dfs(TreeNode n){
        if(n.left!=null) dfs(n.left);
        count--;
        if(count == 0){
            number = n.val;
            return;
        }
        if(n.right!=null)dfs(n.right);
    }

}
