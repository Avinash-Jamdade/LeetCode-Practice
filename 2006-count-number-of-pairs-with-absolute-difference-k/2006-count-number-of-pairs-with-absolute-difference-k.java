class Solution {
    public int countKDifference(int[] nums, int k) {
    int count=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count +=mp.getOrDefault(nums[i]-k,0);
            count +=mp.getOrDefault(nums[i]+k,0);
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}