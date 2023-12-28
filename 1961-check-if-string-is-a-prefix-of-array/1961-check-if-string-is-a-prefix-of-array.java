class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            sb.append(word);
            if(sb.toString().equals(s)){
                return true;
            }
            if(sb.toString().indexOf(word)==-1){
                return false;
            }
        }
        return false;
    }
}