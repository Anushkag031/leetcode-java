class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
       List<List<Integer>> ans=new ArrayList<>();
        if(n<4) return ans;
        Arrays.sort(nums);
        
        for(int i=0; i<n-3; i++)
        {
            if(nums[i]>0 && nums[i]>target) break; // quad cant be formed
            if(i>0 && nums[i]==nums[i-1]) continue; //checking duplicacy
            
            for(int j=i+1; j<n-2; j++)
            {
                if(j>i+1 && nums[j]==nums[j-1]) continue; //checking duplicacy
                //using two sum approach
                
                int K=j+1; //start //left
                int L=n-1; //end // right
                while(K<L)
                {
                    int prev_start=K;
                    int prev_end=L;
                    
                    int sum= nums[i] + nums[j] + nums[K] + nums[L];
                    if(sum==target)
                    {
                       List<Integer> temp= new ArrayList<>(
                            Arrays.asList(nums[i], nums[j], nums[K], nums[L]));
                            ans.add(temp);
                            
                        while(K<L && nums[K]==nums[prev_start]) K++;//duplicacy
                        while(K<L && nums[L]==nums[prev_end]) L--;
                    }
                    else if(sum>target)
                    {
                        L--;
                    }
                    else //(sum<target)
                    {
                        K++;
                    }
                }
            }
        }
        return ans;
        
    }
}
