class Solution {
    public int findComplement(int num) {
        int length=Integer.toBinaryString(num).length();
        int ones=(1<<length)-1;
        return ones^num;
    }
}