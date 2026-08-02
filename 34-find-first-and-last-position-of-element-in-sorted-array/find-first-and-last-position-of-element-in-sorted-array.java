class Solution {

    public int first(int nums[],int k){
    int ans=-1;
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==k){
            ans=mid;
            high=mid-1;
        }
        else if(nums[mid]>k){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }

    return ans;
    
    }
    public int last(int nums[],int k){
 int ans=-1;
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==k){
            ans=mid;
            low=mid+1;
        }
        else if(nums[mid]>k){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }

    return ans;
    }

       
    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{first(nums,target),last(nums,target)};
    }
}