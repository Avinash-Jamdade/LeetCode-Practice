class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> a= new HashSet<Integer>();
        int count=0;
        int len=Integer.MIN_VALUE;
        
        if(nums.length==0)
        {
            return 0;
        }
        for (int num : nums) {
            a.add(num); 
        }for(int it:a)
        {
            if(!a.contains(it-1))
            {
                count=1;
                 int x=it;
                 while(a.contains(x+1))
                 {
                    x=x+1;
                    count+=1;
                 }
                 len=Math.max(len,count);
            }
        }       
        return len;
    }
}
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if (nums.length == 0) { 
//             return 0;
//         }

//         HashSet<Integer> numSet = new HashSet<>();
//         for (int num : nums) {
//             numSet.add(num);
//         }

//         int longest = 0;
//         for (int num : nums) {
         
//             if (!numSet.contains(num - 1)) {
//                 int currentNum = num;
//                 int currentStreak = 1;

//                 while (numSet.contains(currentNum + 1)) {
//                     currentNum += 1;
//                     currentStreak += 1;
//                 }

//                 longest = Math.max(longest, currentStreak);
//             }
//         }

//         return longest;
//     }
// }
