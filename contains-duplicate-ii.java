class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<n; i++)
        { //checking that key is alredy there in map or not
            if(!hm.containsKey(nums[i]))//if not
            {
                hm.put(nums[i],i);
            }
            else //if yes
            {
                int prev=hm.get(nums[i]);//storing previous index
                if(Math.abs(prev-i)<=k) //if found
                {
                    return true;
                }
                else{ //if not found
                    hm.put(nums[i],i);
                }
            }
            
        }
        return false;
    }
}
