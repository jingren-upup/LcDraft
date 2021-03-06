package Leetcode;


import java.util.HashMap;
import java.util.Map;

public class Lc_105_buildTreefromPreorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
    }
    public TreeNode helper(int preStart,int inStart,int inEnd,int[] preorder,int[] inorder){
        if(preStart>preorder.length-1||inStart>inEnd){
                return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        //find root node
        for(int i = inStart;i<=inEnd;++i){
            if(inorder[i] == root.val){
                index = i;
                break;
            }
        }
        root.left = helper(preStart+1,inStart,index -1,preorder,inorder);
        root.right = helper(preStart+index - inStart+1,index+1,inEnd,preorder,inorder);
        return root;
    }
}
