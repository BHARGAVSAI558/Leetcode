class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> dbs = new HashSet<>();

        int max=0;
        int l=0;
        for(int r=0;r<s.length();r++){

            char ch=s.charAt(r);

            while(dbs.contains(ch)){
                dbs.remove(s.charAt(l));
                l++;
            }

            dbs.add(ch);

            max=Math.max(max,r-l+1);


        }
        return max;
    }
}