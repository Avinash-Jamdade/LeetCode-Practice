class Solution {
    public int maxSubArray(int[] nums) {
        int beginEnd=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int v1=beginEnd+nums[i];
            int v2=nums[i];

            beginEnd=Integer.max(v1,v2);
            ans=Integer.max(ans,beginEnd);
        }
        return ans;
    }
}