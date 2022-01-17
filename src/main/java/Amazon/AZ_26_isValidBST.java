package Amazon;



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


public class AZ_26_isValidBST {
    //为什么是long呢？

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode node,long lower,long upper){
        if (node == null){
            return true;
        }
        if (lower>=node.val||upper<=node.val){
            return false;
        }
        return isValidBST(node.left,lower,node.val)&&isValidBST(node.right,node.val,upper);

    }
}
