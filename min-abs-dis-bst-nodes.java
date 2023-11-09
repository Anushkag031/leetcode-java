class Solution {
    int res=Integer.MAX_VALUE;
    TreeNode prev=null;
    public void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        if(prev!=null) 
        {
            res=Math.min(res,root.val-prev.val);
        }
        prev=root;
        inorder(root.right);

    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return res;
    }
}
