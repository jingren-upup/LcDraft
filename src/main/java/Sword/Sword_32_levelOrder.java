package Sword;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Sword_32_levelOrder {

    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        Queue<TreeNode>queue = new LinkedList<TreeNode>(){
            {add(root);
        }};
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left!=null) queue.add(node.left);
            if (node.right!=null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0;i<ans.size();++i){
            res[i] = ans.get(i);
        }
        return res;
    }
}
