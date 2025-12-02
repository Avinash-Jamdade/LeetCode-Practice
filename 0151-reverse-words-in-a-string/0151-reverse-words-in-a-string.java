class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        s=new StringBuilder(s).reverse().toString();
        int n=s.length();
        for(int i=0;i<n;i++){
            StringBuilder word=new StringBuilder();
            while(i<n && s.charAt(i) !=' '){
                word.append(s.charAt(i));
                i++;
            }
            if(word.length()>0){
                if(sb.length()>0){
                    sb.append(" ");
                }
                sb.append(word.reverse());
            }
        }
      return sb.toString(); 
    }
}