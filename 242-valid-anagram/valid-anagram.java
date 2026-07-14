class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character, Integer> dbs=new HashMap<>();

        if(s.length()!=t.length())
        {
            return false;
        }

      for(char k:s.toCharArray()){
        dbs.put(k,dbs.getOrDefault(k,0)+1);
      }
    for(char l:t.toCharArray()){
        if(!dbs.containsKey(l)){
            return false;
        }
    dbs.put(l,dbs.get(l)-1);

    if(dbs.get(l)==0)
    dbs.remove(l);
    }

    return dbs.isEmpty();


    }
}