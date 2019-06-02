package com.tech.binTree;

public class Tree2Str {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
        public String tree2str(TreeNode t) {
            StringBuilder res = new StringBuilder();
            tree2str(t,res);
            return res.toString();
        }
        public void tree2str(TreeNode t,StringBuilder res) {
            if(t == null){
                return;
            }
            res.append(t.val);
            if(t.left != null){
                res.append("(");
                tree2str(t.left,res);
                res.append(")");
            }else{
                if(t.right != null){
                    res.append("()");
                }
            }
            if (t.right != null) {
                res.append("(");
                tree2str(t.right,res);
                res.append(")");
            }
        }
}

