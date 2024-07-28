class Solution {
    public boolean checkIfPangram(String sentence) {
         int arr[]= new int[26];

        for(int i=0;i<sentence.length();i++)
            arr[sentence.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
            if(arr[i]< 1)
                return false;
        
        return true;
    }
}
/*
Set<Character> set = new HashSet<Character>();
        int length = sentence.length();
        for (int i = 0; i < length; i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z')
                set.add(c);
        }
        return set.size() == 26;
*/