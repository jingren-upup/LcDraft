package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class Lc_102_BinaryTreeLevelOrderTraversal {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
            lei(root,0);
            return res;
    }
    private void lei(TreeNode node,int k){
        if(node!=null){
            if(res.size()>k+1){
                res.add(new ArrayList<>());
            }
            res.get(k).add(node.val);
            lei(node.left,k+1);
            lei(node.right,k+1);
        }
    }


}
