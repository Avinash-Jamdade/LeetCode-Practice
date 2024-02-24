class Solution {
    public int getRomanVal(char ch){
        switch(ch){
                case'I':return 1;
                case'V':return 5;
                case'X':return 10;
                case'L':return 50;
                case'C':return 100;
                case'D':return 500;
                case'M':return 1000;
            default:return 0;
        }
    }
    public int romanToInt(String s) {
        int b=s.length();
        int sum=0;
        
        for(int i=0;i<b;i++){
            char ch1=s.charAt(i);
            if((i+1)<b && getRomanVal(ch1) < getRomanVal(s.charAt(i+1)))
                sum=sum-getRomanVal(ch1);
            else
                sum=sum+getRomanVal(ch1);
        }
        return sum;
        
        
    }
}