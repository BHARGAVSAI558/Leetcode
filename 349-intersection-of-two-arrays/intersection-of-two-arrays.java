class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {

            if (!map.containsKey(num)) {
                map.put(num, 1);
            }

        }

       
        for (int num : nums2) {

            if (map.getOrDefault(num, 0) == 1) {
                map.put(num, 2);
            }

        }

        int count = 0;

        for (int value : map.values()) {

            if (value == 2)
                count++;

        }

        int ans[] = new int[count];

        int index = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {

            if (e.getValue() == 2) {

                ans[index++] = e.getKey();

            }

        }

        return ans;

    }

}