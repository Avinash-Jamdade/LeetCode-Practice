class Solution {
    public String defangIPaddr(String address) {
      String replaceaddress=address.replace(".","[.]");
        return replaceaddress;
    }
}
/* 
  StringBuilder replace=new StringBuilder();
        for(char a:address.toCharArray()){
            if(a=='.'){
                replace.append("[.]");
            }
            else{
                replace.append(a);
            }
        }
        return replace.toString();
*/