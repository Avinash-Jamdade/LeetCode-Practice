class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax=0;
        int currMin=0;
        int maxSum=nums[0];
        int minSum=nums[0];
        int sum=0;

        for(int arr:nums){
            currMax=Math.max(currMax,0)+arr;
            maxSum=Math.max(maxSum,currMax);
            currMin=Math.min(currMin,0)+arr;
            minSum=Math.min(currMin,minSum);

            sum +=arr;
        }
        if(sum==minSum){
            return maxSum;
        }
        return Math.max(maxSum,sum-minSum);
    }
}