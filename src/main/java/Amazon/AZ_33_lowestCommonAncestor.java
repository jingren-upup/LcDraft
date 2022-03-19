package Amazon;

import java.util.ArrayList;
import java.util.List;

public class AZ_33_lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null || root == p||root == q){
//            return root;
//        }
//        TreeNode left = lowestCommonAncestor(root.left,p,q);
//        TreeNode right = lowestCommonAncestor(root.right,p,q);
//        if(left == null) return right;
//        if(right == null) return left;
//        return root;
        if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(root.val<p.val&&root.val<q.val){
            return  lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
}