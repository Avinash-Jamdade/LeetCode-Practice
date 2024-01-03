class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>splitseparator=new ArrayList();
        for(int i=0;i<words.size();i++){
            String wordsArray[]=words.get(i).split("["+separator+"]");
            for(String str1 : wordsArray){
                if(str1 !=""){
                    splitseparator.add(str1);
                }
            }
        }
        return splitseparator;
    }
}