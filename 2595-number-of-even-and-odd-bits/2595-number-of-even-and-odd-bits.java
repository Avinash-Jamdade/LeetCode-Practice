class Solution {
    public int[] evenOddBit(int n) {
        int num=0;
        int even=0,odd=0;
        while(n > 0){
            if((n & 1) == 1){
                if(num % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            n>>=1;
            num++;
        }
        return new int[] {even, odd};
    }
}