package Leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class Lc_226_invertTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
