class Solution {
    public int hammingDistance(int x, int y) {
        int distance=x^y;
        int count=0;
        while(distance > 0){
            count +=distance &1;
            distance>>=1;
        }
        return count;
        
    }
}