package com.tech.day;

public class Mirror {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val){
            this.val = val;

        }

    }
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        if(root.left != null || root.right != null){
            TreeNode left = root.left;
            root.left = root.right;
            root.right = left;
        }
        if(root.left != null)
            Mirror(root.left);
        if(root.right != null)
            Mirror(root.right);
    }
}
