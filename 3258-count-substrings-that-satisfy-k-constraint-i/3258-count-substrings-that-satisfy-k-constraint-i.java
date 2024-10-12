class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int count=0;
        for(int start=0;start<n;start++){
            int zero_count=0,one_count=0;
            for(int end=start;end<n;end++){
                if(s.charAt(end)=='0'){
                    zero_count++;
                }
                else{
                    one_count++;
                }
                if(zero_count<=k || one_count<=k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}