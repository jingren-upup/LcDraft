package Leetcode;


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
      }
  }


public class Lc_129_sumNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    private int helper(TreeNode root,int i){
        if(root == null) return 0;
        int tmp = i*10+root.val;
        if(root.left == null && root.right == null){
            return tmp;
        }
        return helper(root.left,tmp) + helper(root.right,tmp);
    }
}
