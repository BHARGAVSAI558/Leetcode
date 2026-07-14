class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet <Integer> dbs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
          
           if(dbs.contains(nums[i]))
           {
            return true;
           }
            dbs.add(nums[i]);
        }

        return false;
    }
}