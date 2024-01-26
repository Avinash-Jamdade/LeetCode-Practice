class Solution {
    public int percentageLetter(String s, char letter) {
        int count[]=new int [26];
        int len=s.length();
        for(int i=0;i<len;i++){
            count[s.charAt(i)-'a']++;
        }
        int freq=count[letter-'a'];
        int percentage=(freq*100)/len;
        return percentage;
    }
}