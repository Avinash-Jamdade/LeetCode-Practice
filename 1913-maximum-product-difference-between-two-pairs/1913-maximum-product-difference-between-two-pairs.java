class Solution {
    public int maxProductDifference(int[] nums) {
        int largest=0, secondLargest=0;
        int smallest=Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;
        for(int n:nums){
            if(n<smallest){
                secondSmallest=smallest;
                smallest=n;
            }
            else if(n<secondSmallest){
                secondSmallest=n;
            }
            if(n>largest){
                secondLargest=largest;
                largest=n;
            }
            else if(n>secondLargest){
                secondLargest=n;
            }
        }
        return(largest * secondLargest)-(smallest * secondSmallest);
    }
}