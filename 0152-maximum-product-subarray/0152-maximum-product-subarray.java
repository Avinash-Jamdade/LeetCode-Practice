class Solution {
    public int maxProduct(int[] nums) {
        int minending = nums[0];
        int maxending = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = minending * nums[i];
            int v3 = maxending * nums[i];

            maxending = Integer.max(v1, Integer.max(v2, v3));
            minending = Integer.min(v1, Integer.min(v2, v3));

            res = Integer.max(res, maxending);
        }

        return res;
    }
}
