
//problem:https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int[n];
        int j;
        int i;
        for( i=0; i<prices.length;i++){
            for( j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                ans[i]=prices[i]-prices[j]; 
                break; 
                }
            }
            if(j==prices.length){
            ans[i]=prices[i];
            }
        }
        return ans;
        
        
        
    }
}
