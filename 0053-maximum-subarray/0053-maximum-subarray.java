class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int 
//         int currentSum = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             currentSum += nums[i];
            
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
            
//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//         }
        
//         return maxSum;
//     }
// }