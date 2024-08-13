class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return checkPalindromeByParts(a, b) || checkPalindromeByParts(b, a);
    }
    
    private boolean checkPalindromeByParts(String a, String b) {
        int i = 0, j = a.length() - 1;
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }
    
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
