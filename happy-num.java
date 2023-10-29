class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            int curr=n;
            int sum=0;
            while(curr!=0){
                int rem=curr%10;
                sum=sum+(rem*rem);
                curr=curr/10;
            }
            if(set.contains(sum)) return false;
            n=sum;
            set.add(sum);
        }
        return true;
    }
}
