class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
         
        
        HashMap<TreeNode, TreeNode> parent=new HashMap<>(); 
        
        markParent(root,parent);
        
        ArrayList<Integer> res=fun(parent, target, k);
        return res;
    }
    //level order traversal  for storing ele in hashmap
    static void markParent(TreeNode root, HashMap<TreeNode, TreeNode> parent)
    {
        Queue<TreeNode> q=new LinkedList<>(); //for bfs
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll(); //popping the top ele
            
            if(curr.left!=null) //if left exists
            {
                parent.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null) //if right exists
            {
                parent.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
     //level order traversal  for storing ele in q and checking duplicacy
    static ArrayList<Integer> fun(HashMap<TreeNode, TreeNode> parent, TreeNode target, int k)
    {
        Queue<TreeNode> q=new LinkedList<>();
        HashSet<TreeNode> vis=new HashSet<>(); //for duplicacy
        
        q.add(target); vis.add(target); // adding starting node
        
        int count=0; // for steps
        while(!q.isEmpty())
        {
            int size=q.size();
            
            if(count==k) break;
            count++;
            
            // traversing left, right, upwards
            for(int i=0; i<size; i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null && !vis.contains(curr.left))
                {
                    q.add(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null && !vis.contains(curr.right))
                {
                    q.add(curr.right);
                    vis.add(curr.right);
                }
                if(parent.get(curr)!=null && !vis.contains(parent.get(curr)))//if parent is not null&visited
                {
                    q.add(parent.get(curr));
                    vis.add(parent.get(curr));
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();//whatever values are left in q are ans
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            ans.add(curr.val);
        }
        Collections.sort(ans);
        return ans;
    }
    
    
}
