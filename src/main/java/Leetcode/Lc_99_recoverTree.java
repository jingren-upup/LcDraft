package Leetcode;


import java.util.HashMap;
import java.util.Map;

public class Lc_99_recoverTree {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;

    }
    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(first == null && pre.val> root.val) first = pre;
        if(first != null && pre.val> root.val) second = root;
        pre = root;
        inOrder(root.right);
    }

}
