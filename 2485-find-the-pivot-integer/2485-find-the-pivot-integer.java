class Solution {
    public int pivotInteger(int n) {
     
        long num = n*(n+1)/2L;

        double x = Math.pow(num,0.5);
        if(Math.ceil(x) - x == 0){
            return (int)(x);
        }else{
            return -1;
        }
    }
}