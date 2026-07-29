class Solution {

    public int BS(int nums[],int low,int high,int tar){

        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(nums[mid]==tar){
           return mid; 
        }
        else if(nums[mid]<tar){
            return BS(nums,mid+1,high,tar);
        }
        else{
             return BS(nums,low,mid-1,tar);
        }
    
    }

    public int search(int[] nums, int target) {
        
        return BS(nums,0,nums.length-1,target);
       
    }
}