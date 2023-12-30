class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       int newArray[][]=new int [m][n];
        int len=original.length;
       if (len != m * n) {
            return new int[0][0];
        }
        
        int x=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               newArray[i][j]=original[x++];
            }
        }
        return newArray;
    }
}