class Solution {
    public List<String> fizzBuzz(int n) {
        String ans[]=new String[n];
        for(int i=0; i<n; i++)
        {
            if((i+1)%15==0)
            ans[i]="FizzBuzz";
            else if((i+1)%3==0)
            ans[i]="Fizz";
            else if((i+1)%5==0)
            ans[i]="Buzz";
            else 
            ans[i]=Integer.toString(i+1);
        } 
        return Arrays.asList(ans);
        
    }
}
