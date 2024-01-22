class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(m,n) -> -Integer.compare(m[1],n[1]));
        int maxUnit=0;
        for(int box []:boxTypes){
           if(truckSize<box[0]){
               return maxUnit + truckSize * box[1];
           }
            maxUnit += box[0] * box[1];
            truckSize -=box[0];
        }
        return maxUnit;
    }
}