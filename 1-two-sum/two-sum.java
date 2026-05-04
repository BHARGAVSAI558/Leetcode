class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    
     HashMap<Integer,Integer> dbs=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int req=target-nums[i];
        if(dbs.containsKey(req)){
        
        return new int[]{dbs.get(req),i};
       
        }
        dbs.put(nums[i], i);

    }
     return new int []{-1,-1};
     
}
}