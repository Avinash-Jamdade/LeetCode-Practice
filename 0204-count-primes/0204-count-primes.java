class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0 ;
        }
        
        boolean[] composites=new boolean[n];
        int limit=(int)Math.sqrt(n);
        for(int i=2;i<=limit;i++){

            if(composites[i]==false){
                for(int j=i*i;j<n;j+=i){
                    composites[j]=true;
                }
            }
        }
        int count=0;
for(int i=2;i<n;i++){
    if(composites[i]==false){
        count++;
    }
}
  return count;      
        }
    }