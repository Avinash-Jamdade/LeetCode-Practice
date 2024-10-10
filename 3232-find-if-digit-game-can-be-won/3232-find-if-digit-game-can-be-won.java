class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0,sum2=0;
        for(int num:nums){
            if(num>=0 &&num<=9){
                sum1+=num;
            }
            else{
                sum2+=num;
            }
        }
        if(sum1==sum2){
            return false;
        }
        return true;
    }
}