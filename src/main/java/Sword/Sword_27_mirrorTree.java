package Sword;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}

public class Sword_27_mirrorTree {
    class Solution {

        public TreeNode mirrorTree(TreeNode root) {

            return recur(root);
        }

        public TreeNode recur(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode leftRoot = recur(root.right);
            TreeNode rightRoot = recur(root.left);
            root.left = leftRoot;
            root.right = rightRoot;
            return root;
        }
    }
}

