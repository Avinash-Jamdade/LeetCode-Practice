class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int operator=0;
        for(String operation:operations){
            if(operation.contains("++")){
               operator++; 
            }
            else {
                operator--;
            }
        }
        return operator;
    }
}