class Solution {
     public boolean isVowel(char ch){
            return(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u' || ch=='A'|| ch=='E' || ch=='I'|| ch=='O' || ch=='U');
        }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int mid=n/2;
        int i=0;
        int j=mid;
        int countR=0;
        int countL=0;
        while(i<n/2 && j<n){
            if(isVowel(s.charAt(i))){
                countL++;
            }
            if(isVowel(s.charAt(j))){
                countR++;
            }
            i++;
            j++;
        }
        return countL==countR;
    }
}