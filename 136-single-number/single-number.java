class Solution {
    public int singleNumber(int[] nums)
    {
        HashMap <Integer,Integer> dbs=new HashMap<>();

        for(int i : nums)
        {
            dbs.put(i,dbs.getOrDefault(i,0)+1);
        }

      for (Map.Entry<Integer, Integer> entry : dbs.entrySet()){
        if(entry.getValue()==1){
            return entry.getKey();
        }
      }
        return -1;

    }
}