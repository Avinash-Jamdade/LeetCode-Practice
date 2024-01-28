class Solution {
    public int bitwiseComplement(int n) {
        int l=Integer.toBinaryString(n).length();
        int one=(1<<l)-1;
        return one^n;
    }
}