 class Solution {
      public boolean isPalindrome(int n) {
          int revNum=0;
          int Dup=n;
          while(n>0){
              int ld=n%10;
              revNum=(revNum*10)+ld;
              n=n/10;
          }
          if(Dup==revNum){
              return true;
          }
          else{
              return false;
          }
      }
 }














// class Solution {
//     public boolean isPalindrome(int x) {
//         int temp=x;
//         int rev=0;
//         while(x>0){
//             int digit=x%10;
//             rev=(rev*10)+digit;
//             x=x/10;
//         }
//         if(rev==temp){
//             return true;
//         }
//         return false;
//     }
    
// }