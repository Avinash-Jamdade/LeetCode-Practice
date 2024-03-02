class Solution {
    public int singleNumber(int[] nums) {
        int first=0,second=0;
      for(int x:nums)
     {
        first=(first^x)&(~second);
        second=(second^x)&(~first);  
     }
        return first;
    }
}