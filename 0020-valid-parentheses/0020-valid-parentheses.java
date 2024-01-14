class Solution {
    public boolean isValid(String s) {
        Stack<Character> S= new Stack<>();
        for(int i=0;i<s.length();i++){
            char vh=s.charAt(i);
            if(vh=='(' || vh == '{' || vh=='['){
                S.push(vh);
                
            }
            else{
                if(S.isEmpty()){
                    return false;
                }
                if((S.peek()=='(' && vh==')') || (S.peek()=='[' && vh==']') |(S.peek()=='{' && vh=='}')){
                    S.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(S.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}