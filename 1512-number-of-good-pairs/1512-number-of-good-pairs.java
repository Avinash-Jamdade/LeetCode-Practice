class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        int countArray[]=new int[101];
        for(int num:nums){
            res += countArray[num]++;
        }
        return res;
    }   
}