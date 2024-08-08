class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb.toString())) {
            count++;
            sb.append(word);
        }

        return count;
    }
}
