package Amazon;

public class AZ_34_diameterOfBinaryTree {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        dfs(root);
        return res;

    }
    private int dfs(TreeNode root){
        //都为空则退出
        if (root.left == null && root.right == null){
            return 0;
        }
        //左右长度
        int leftsize = root.left == null?0:dfs(root.left)+1;
        int rightsize = root.right == null?0:dfs(root.right)+1;
        res = Math.max(leftsize+rightsize,res);
        //返回最长边长
        return Math.max(leftsize,rightsize);
    }
}