class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root)!=-1;
        
    }
    int checkBalance(TreeNode root){
        if(root==null) return 0;
        int leftHeight =checkBalance(root.left);
        if (leftHeight ==-1) return -1;
         int rightHeight =checkBalance(root.right);
        if (rightHeight ==-1) return -1;

        if (Math.abs(leftHeight -rightHeight)>1)
        return -1;
    return Math.max(leftHeight, rightHeight)+1;
    }
}
