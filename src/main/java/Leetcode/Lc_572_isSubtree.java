package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class Lc_572_isSubtree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(isSame(root,subRoot)) return true;
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    private boolean isSame(TreeNode s, TreeNode t){
        if(s==null && t == null) return true;
        if(s==null || t ==null) return false;
        if(s.val!= t.val) return false;

        return isSame(s.left,t.left)&&isSame(s.right,t.right);
    }
}
