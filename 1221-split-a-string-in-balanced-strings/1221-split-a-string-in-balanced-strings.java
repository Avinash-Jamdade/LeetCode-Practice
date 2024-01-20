class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int cha=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                cha++;
            }
            else{
                cha--;
            }
            if(cha==0){
                count++;
            }
        }
        return count;
    }
}