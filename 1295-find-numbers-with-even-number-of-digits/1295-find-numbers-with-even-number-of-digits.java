class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num :nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int numberOfDigit=digit(num);
        if(numberOfDigit % 2==0){
            return true;
        }
        return false;
    }
    static int digit(int num){
        if(num <0){
            num=num* -1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num >0){
            count++;
            num=num/10;
        }
        return count;
        
    }
}