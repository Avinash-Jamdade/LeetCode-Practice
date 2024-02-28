class Solution {
    public int[] plusOne(int[] digits) {
        int m=digits.length;
        for (int i=m-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }      
            digits[i]=0;           
        }
        int[] newNumber=new int[m+1];
        newNumber[0]=1;
        return newNumber;
    }
    
}