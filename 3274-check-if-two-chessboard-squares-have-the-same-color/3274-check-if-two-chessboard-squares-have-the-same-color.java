class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int x1,x2,y1,y2;
        x1=coordinate1.charAt(0)-'a';
        x2=coordinate2.charAt(0)-'a';
        y1=coordinate1.charAt(1)-'1';
        y2=coordinate2.charAt(1)-'1';
        int sum1=x1+y1;
        int sum2=x2+y2;
        if((sum1 %2==0 && sum2%2==0)|| (sum1 %2!=0 && sum2%2!=0)){
            return true;
        }
        return false;
    }
}