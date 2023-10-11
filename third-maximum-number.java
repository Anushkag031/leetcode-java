class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>(); //for duplicacy
        for(int i:nums)
        {
            set.add(i);
        }
        int arr[]=new int[set.size()];
        int index=0;
        for(int i :set)
        {
            arr[index]=i;
            index++;
        }
        Arrays.sort(arr);
        int n=arr.length;
        if(arr.length<3) return arr[n-1];

        return arr[n-3];


     /*  Integer max=null;
       Integer secMax=null;
       Integer thirdMax=null;
       for(Integer num:nums)
       {
           if(num.equals(max)||num.equals(secMax)||num.equals(thirdMax))
           {
               continue;
           }
           if(max==null||num>max)
           {
              thirdMax= secMax;
              secMax=max;
               max=num;
           }
           else if(secMax==null|| num>secMax)
           {
               thirdMax=secMax;
               secMax=num;
           }
           else if(thirdMax==null||num>thirdMax)
           {
               thirdMax=num;
           }
       }
       if(thirdMax==null)
       { 
           return max;
       }
       return thirdMax;
       */

    }
}
