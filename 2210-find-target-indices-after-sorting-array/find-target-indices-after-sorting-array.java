class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      
      List<Integer> ans=new ArrayList<>();
      int low=0;
      int cnt=0;

      for(int n:nums){

        if(n<target){
        low++;
        }
        else if (n==target){
            cnt++;
        }

      }
    for(int i=1;i<=cnt;i++){
        ans.add(low+i-1);
    }

    return ans;
}
}