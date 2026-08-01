class Solution {

    public int search(int[] nums, int tar) {
        
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(tar==nums[mid]){
                return mid;
            }
            else if(nums[mid]<tar){
                low=mid+1;

            }
            else {
                high=mid-1;

            }
        }

        return -1;
    }
}