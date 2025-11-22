class Solution {
    public String minWindow(String s, String t) {
    if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) return "";

    int[] freq = new int[128];
    for (char c : t.toCharArray()) freq[c]++;

    int left = 0, right = 0, required = t.length();
    int minLen = Integer.MAX_VALUE, start = 0;

    while (right < s.length()) {
        char r = s.charAt(right);
        if (freq[r] > 0) required--;
        freq[r]--;
        right++;

        while (required == 0) {
            if (right - left < minLen) {
                minLen = right - left;
                start = left;
            }

            char l = s.charAt(left);
            freq[l]++;
            if (freq[l] > 0) required++;

            left++;
        }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
}

}