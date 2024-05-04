public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int bit = 0;
        for (int i = 0; i < 32; i++) {
            bit <<= 1;
            bit |= (n & 1);
            n >>= 1;
        }
        return bit;
    }
}