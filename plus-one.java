class Solution {
    public int[] plusOne(int[] digits) {
       int n=digits.length;
       for(int i=n-1; i>=0; i--)
       {
           if(digits[i]<9) //if digit id less then 9
           {
               digits[i]++;
               return digits;
           }
           digits[i]=0; //setting last digit 0 if dig>9
       } 
       int[] newArr=new int[n+1]; //new array
       newArr[0]=1;
       return newArr;
    }
}
