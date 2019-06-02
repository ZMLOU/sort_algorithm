package com.tech.binTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
       TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if(node.left != null)
                levelOrder(node.left);
            if(node.right != null)
                levelOrder(node.right);
        }
        return null;
    }
}
