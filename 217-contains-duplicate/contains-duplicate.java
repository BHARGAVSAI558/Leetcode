class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> dbs = new HashMap<>();

      for(int i:nums){

        dbs.put(i,dbs.getOrDefault(i,0)+1);

        if(dbs.get(i)>1){
            return true;
        }
      }

      return false;

    }

}