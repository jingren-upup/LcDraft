package Sword;

import java.util.ArrayList;
import java.util.List;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}

public class Sword_26_isSubstructure {
    class Solution {
        public boolean isSubstructure (TreeNode A,TreeNode B) {
            return ((A!=null&&B!=null)&&(recur(A,B)||isSubstructure(A.left,B)||isSubstructure(A.right,B)));
        }
        public boolean recur(TreeNode A, TreeNode B){
            if (B==null){
                return true;
            }
            if (A==null||A.val !=B.val){
                return false;
            }
            return recur(A.left,B.left) && recur(A.right,B.right);
        }

    }
}

