package Sword;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}

public class Sword_28_isSymmetric {
    class Solution {

        public boolean isSymmetric(TreeNode root) {

            return root == null ? true : recur(root.left, root.right);
        }

        public boolean recur(TreeNode Left, TreeNode Right) {
            if (Left == null && Right == null) {
                return true;
            }
            if (Left == null || Right == null || Left.val != Right.val) {
                return false;
            }
            return recur(Left.left, Right.right) && recur(Left.right, Right.left);
        }
    }
}

