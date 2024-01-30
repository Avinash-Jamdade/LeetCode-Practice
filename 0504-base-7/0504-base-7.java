class Solution {
    public String convertToBase7(int num) 
    {
        int base=1;
        int ans=0;
        while(num!=0)
        {
            int rem=num%7;
            ans+=base*rem;
            base*=10;
            num/=7;
        }    
        return Integer.toString(ans);
    }
}