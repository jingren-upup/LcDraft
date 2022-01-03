package Amazon;

import java.util.ArrayList;
import java.util.List;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}

public class AZ_29_maxPathSum {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
            dfs(root);
            return result;
       }
       public int dfs(TreeNode root){
            int max = 0;
            //叶子直接返回0
            if (root==null){
                return 0;
            }
            //左右情况摸底
            int left = dfs(root.left);
            int right = dfs(root.right);
            result = Math.max(result,root.val+left+right);
            max = Math.max(root.val+left, root.val+right);
            return max<0?0:max;
       }
}

