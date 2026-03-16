class Solution {
    public char nextGreatestLetter(char[] nums, char tar) {
        
        char ans=nums[0];
        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int mid=low+(high-low)/2;
            if((nums[mid]-'0')>(tar-'0')){
                ans=nums[mid];
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;

    }
}