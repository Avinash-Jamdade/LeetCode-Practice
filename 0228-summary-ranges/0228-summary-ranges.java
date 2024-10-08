class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int start=i;
            while(i+1<n &&nums[i+1]== nums[i]+1){
                i++;
            }
            int end=i;
            if(start==end){
                ans.add(String.valueOf(nums[start]));
            }
            else{
                 ans.add(String.valueOf(nums[start]) + "->" + String.valueOf(nums[end]));
            }
        }
        return ans;
    }
}