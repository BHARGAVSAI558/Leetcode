class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int left=0,max=0;

        HashSet<Character>dbs = new HashSet<>();

        for (int i=0;i<s.length();i++)
         {
            while (dbs.contains(s.charAt(i))) 
            {
                dbs.remove(s.charAt(left));
                left++;
            }
            
            dbs.add(s.charAt(i));

            max = Math.max(max,i-left+1);

        }
        return max;
    }
}