
class Solution {
    public boolean isPerfectSquare(int num) {
       double sqr = Math. sqrt(num);
       int val = (int) sqr;
    if((val*val)==num)
    {
        return true;
    }
    return false;
        
    }
}