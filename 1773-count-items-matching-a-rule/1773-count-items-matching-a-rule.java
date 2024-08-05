class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
/*
 int ans=0;
        if(ruleKey.equals("type")){
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
        }
        else if(ruleKey.equals("color")){
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
        }
        else{
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
*/