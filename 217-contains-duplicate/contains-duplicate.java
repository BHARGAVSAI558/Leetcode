class Solution {

    public boolean containsDuplicate(int[] nums) {


        HashSet <Integer> map=new HashSet<>();
        for(int i:nums){

            map.add(i);

        }

        if(map.size()!=nums.length){
            return true;
        }

return false;
    
    }


}