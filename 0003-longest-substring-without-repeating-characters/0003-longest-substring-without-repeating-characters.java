class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();

        int left=0, maxLen=0;
        Map<Character, Integer>map=new HashMap<>();

        for(int right=0;right<n;right++){
            char c=s.charAt(right);

            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
    
}