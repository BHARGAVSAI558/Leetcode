class Solution {

    public boolean isVowel(char p){
        if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k)
     {
        int l=0;
        int max=Integer.MIN_VALUE;
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