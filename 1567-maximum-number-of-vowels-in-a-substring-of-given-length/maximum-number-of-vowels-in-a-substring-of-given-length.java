class Solution {

   public boolean isVowel(char ch) {
    return ch == 'a' ||
           ch == 'e' ||
           ch == 'i' ||
           ch == 'o' ||
           ch == 'u';
}
    public int maxVowels(String s, int k)
     {
        int l=0;
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char p=s.charAt(i);
            
            if(isVowel(p)){
                count++;
            }

            if(i-l+1>k){
              char left = s.charAt(l);

                if (isVowel(left))
                {
                    count--;
                }
                l++;
            }
            if(i-l+1==k){
            max=Math.max(max,count);
            }
        }

        return max;
        
    }
}