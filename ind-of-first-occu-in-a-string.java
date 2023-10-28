class Solution {
    public int strStr(String hs, String ne) {
        for(int i=0;i<hs.length()-ne.length()+1; i++)
        {
            if(hs.charAt(i)==ne.charAt(0))
            {
                if(hs.substring(i,ne.length()+i).equals(ne))
                return i;
            }
        }
        return -1;
    }
}
