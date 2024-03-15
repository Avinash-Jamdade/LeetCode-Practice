class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String S1=strs[0];
        String S2=strs[strs.length-1];
        int i=0;
        while(i<S1.length()){
            if(S1.charAt(i)==S2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        return i==0?"":S1.substring(0,i);
    }
}