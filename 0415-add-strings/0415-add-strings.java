class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int r1=num1.length();
        int r2=num2.length();
        int carry=0;
        while(r1 > 0 || r2 > 0){
            int b1=(r1>0 ?(num1.charAt(r1-1)-'0'):0);
            int b2=(r2>0 ?(num2.charAt(r2-1)-'0'):0);
            int sum=(b1+b2+carry)%10;
            carry=(b1+b2+carry)/10;
            result.insert(0, sum);
			r1 -= 1;
			r2 -= 1;
        }
        if(carry>0){
            		result.insert(0, carry);
		}
		return result.toString();
    }
}