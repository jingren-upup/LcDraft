package Leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lc_545_boundaryOfBinaryTree {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root != null){
            res.add(root.val);
            getBounds(root.left,res,true,false);
            getBounds(root.right,res,false,true);
        }
        return res;
    }
    private void getBounds(TreeNode node, List<Integer>res, boolean lb, boolean rb){
        if(node == null) return;
        if(lb) res.add(node.val);
        if(!lb&&!rb&&node.left==null&&node.right==null) res.add(node.val);
        getBounds(node.left,res,lb,rb&&node.right == null);
        getBounds(node.right,res,lb&&node.left == null,rb);
        if(rb) res.add(node.val);
    }
}
