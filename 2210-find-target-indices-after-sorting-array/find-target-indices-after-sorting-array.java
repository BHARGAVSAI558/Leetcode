class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int less = 0;
        int equal = 0;
        for (int num : nums) {
            if (num < target) {
                less++;
            } else if (num==target) {
                equal++;
            }
        }
        for (int i = 0; i < equal; i++) {
            ans.add(less + i);
        }
        return ans;
    }
}