class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) { 
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;
        for (int num : nums) {
         
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}
