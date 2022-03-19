package Amazon;

import java.util.ArrayList;
import java.util.List;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}

public class AZ_28_zigzaglevelOrder {
    List<List<Integer>> nodes = new ArrayList<>();
    public List<List<Integer>>  zigzagLevelOrder(TreeNode root) {
            lei(root,0);
            return nodes;

       }
       public void lei(TreeNode root, int k){
            if (root!=null){
                if (nodes.size()<k+1){
                    nodes.add(new ArrayList<>());
                }
                if (k/2==0){
                    //左边
                    nodes.get(k).add(root.val);
                }else{
                    //右边
                    nodes.get(k).add(0,root.val);
                }

                lei(root.left,k+1);
                lei(root.right,k+1);
            }
       }
}

