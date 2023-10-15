class Solution {
     ArrayList<TreeNode> al;
    public TreeNode balanceBST(TreeNode root) {   
        //Add your code here.
        al=new ArrayList<>();
        inorder(root);
        return balancedTree(0,al.size()-1);
    }
    void inorder(TreeNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            al.add(root);
            inorder(root.right);
        }
    }    
    TreeNode balancedTree(int l, int r)
    {
        if(l>r) return null;
        int m=(l+r)/2;
        
        TreeNode root=al.get(m);
        root.right=balancedTree(m+1,r);
        root.left=balancedTree(l,m-1);
        
        return root;
    }   
}
