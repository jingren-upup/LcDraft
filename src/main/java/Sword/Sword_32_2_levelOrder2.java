package Sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}

public class Sword_32_2_levelOrder2 {
    List<List<Integer>> nodes = new ArrayList<>();
    public List<List<Integer>>  levelOrder(TreeNode root) {
            lei(root,0);
            return nodes;
       }
       public void lei(TreeNode root, int k){
            if (root!=null){
                if (nodes.size()<k+1){
                    nodes.add(new ArrayList<>());
                }
                nodes.get(k).add(root.val);
                lei(root.left,k+1);
                lei(root.right,k+1);
            }
       }
}

