class Solution {

    public int first(int nums[],int n)
    {
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==n){
                ans=mid;
                  high=mid-1;
            }
            else if(nums[mid]>n){
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

    return ans;

    }
    public int last(int nums[],int n){
          int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==n){
               low=mid+1;
                ans=mid;
            }
            else if(nums[mid]>n){
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

    return ans;

    
    }

    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{ first(nums,target),last(nums,target)};
    }
}