class Solution {
    public int xorOperation(int n, int start) {
        int x= start;
    for(int i = start+2; i <= n * 2 - 2 + start; i += 2){
            x ^= i;
        }
        return x;
    }
}