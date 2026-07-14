class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> dbs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            
           dbs.add(nums[i]);

    }
    if(dbs.size()==nums.length){
        return false;
    }
    return true;
    }

}