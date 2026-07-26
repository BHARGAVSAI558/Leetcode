class Solution {

    public int characterReplacement(String s, int k) {

    HashMap <Character , Integer> dbs=new HashMap<>();

    int l=0;
    int maxf=0;
    int ans=0;

    for(int r=0;r<s.length();r++){

        char ch=s.charAt(r);

        dbs.put(ch,dbs.getOrDefault(ch,0)+1);

        maxf=Math.max(maxf,dbs.get(ch));
    
    
    while((r-l+1)-maxf >k)
    {
        char leftchar=s.charAt(l);
        dbs.put(leftchar,dbs.get(leftchar)-1);
        l++;

    }

    ans=Math.max(r-l+1,ans);
    }
    return ans;

    }
}