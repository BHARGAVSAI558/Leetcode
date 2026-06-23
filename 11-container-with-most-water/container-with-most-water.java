class Solution {

    public int maxArea(int[] nums) 
    {
        int area=0;
        int left=0;
        int right=nums.length-1;

        while(left<right){

            int w=right-left;

            int min=Math.min(nums[right],nums[left]);

            int ans=w*min;

        area=Math.max(ans,area);
        if(nums[left]<nums[right]){
            left++;
        }
        else{
            right--;
        }

        }
        return area;
    }
}