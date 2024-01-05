class Solution {
    public boolean isPowerOfFour(int n) {
       return Math.log10(n)/Math.log10(4) % 1==0;
//         if(n<1){
//             return false;
            
//         }
//         while(n>1){
//            if(n % 4 !=0){
//                return false;
//            }
//             n=n/4;
//         }
//         if(n==1){
//             return true; 
//         }
//         else{
//              return false;
//         }
        
//     }
    }
}