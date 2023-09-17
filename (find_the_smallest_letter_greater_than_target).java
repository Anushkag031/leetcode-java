class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       // int left=0;
       //  int right=letters.length-1;

      //  while(left<=right)
      //  {
      //     int mid=(left+right)/2;                 
      //      if(letters[mid]>target)
      //      right=mid-1;
      //      if(letters[mid]<=target)
      //      left=mid+1;
      //  }
      //  return letters[left%letters.length];
        Arrays.sort(letters);
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
    }
}
