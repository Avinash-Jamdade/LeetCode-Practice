public class Solution {
    public int minTimeToType(String word) {
        int totalTime = 0;
        char currentChar = 'a'; 
        for (int i = 0; i < word.length(); i++) {
            char nextChar = word.charAt(i);
            int clockwiseDist = Math.abs(nextChar - currentChar);
            int counterClockwiseDist = 26 - clockwiseDist;
            totalTime += Math.min(clockwiseDist, counterClockwiseDist) + 1;  
            currentChar = nextChar;
        }

        return totalTime;
    }
}
/*
public class Solution {
    public int minTimeToType(String word) {
        int totalTime = 0;
        char currentChar = 'a';  // Start from 'a'

        for (int i = 0; i < word.length(); i++) {
            char nextChar = word.charAt(i);
            int clockwiseDist = Math.abs(nextChar - currentChar);
            int counterClockwiseDist = 26 - clockwiseDist;
            totalTime += Math.min(clockwiseDist, counterClockwiseDist) + 1;  // +1 for typing the character
            currentChar = nextChar;  // Move pointer to the current character
        }

        return totalTime;
    }
}
*/