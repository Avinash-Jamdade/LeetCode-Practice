class Solution {
    public boolean hasAlternatingBits(int n) {
        int PreBit = n & 1;
        n>>=1;
        while(n>0){
            int CurrBit=n&1;
            if(CurrBit==PreBit){
                return false;
            }
            PreBit=CurrBit;
            n>>=1;
        }
        return true;
    }
}