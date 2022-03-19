package Leetcode;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Lc_543_diameterOfBinaryTreeBFS {
    public int diameterOfBinaryTree(TreeNode root) {
        if( root == null){
            return 0;
        }
        if(root == null){
            return 0;
        }
        int overallNodeMax = 0;
        Stack<TreeNode> nodeStack = new Stack<>();
        Map<TreeNode,Integer> nodePathCountMap = new HashMap<>();
        nodeStack.push(root);
        while(!nodeStack.isEmpty()){
            TreeNode node = nodeStack.peek();
            if(node.left != null && !nodePathCountMap.containsKey(node.left)){
                nodeStack.push(node.left);
            }else if(node.right!=null && !nodePathCountMap.containsKey(node.right)){
                nodeStack.push(node.right);
            }else {
                TreeNode rootNodeEndofPostOrder = nodeStack.pop();
                int leftMax = nodePathCountMap.getOrDefault(rootNodeEndofPostOrder.left,0);
                int rightMax = nodePathCountMap.getOrDefault(rootNodeEndofPostOrder.right,0);
                int nodeMax = 1 + Math.max(leftMax,rightMax);
                nodePathCountMap.put(rootNodeEndofPostOrder,nodeMax);
                overallNodeMax = Math.max(overallNodeMax,leftMax + rightMax );
            }

        }
        return overallNodeMax;

    }
}
