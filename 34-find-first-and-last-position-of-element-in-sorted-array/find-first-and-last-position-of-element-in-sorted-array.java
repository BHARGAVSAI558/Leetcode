class Solution {

    public int first(int []nums, int x){

        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return first;

    }

    public int last(int []nums,int x){
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==x)
            {
                last=mid;
               low=mid+1;
            }
            else if(nums[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        
       
        

        return new int[]{ first(nums,target),last(nums,target)};

    }
}