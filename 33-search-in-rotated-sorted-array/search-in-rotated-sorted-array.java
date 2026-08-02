class Solution {
    public int search(int[] nums, int k) {
      
      int low=0;
      int high=nums.length-1;

      while(low<=high)
      {
        int mid=low+(high-low)/2;

        if(nums[mid]==k){
            return mid;
        }

       if(nums[low]<=nums[mid])
       {
       if(nums[mid]> k && nums[low]<=k){
           high=mid-1;
        }
        else{
            low=mid+1;
        }
       }

       else{
        if(nums[high]>=k && nums[mid]<k){
            low=mid+1;
        }
        else{
            high=mid-1;
        }

       }

      }
      return -1;

        }
}