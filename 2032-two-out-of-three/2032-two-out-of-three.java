class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];
        for (int i : nums1) b1[i] = true;
        for (int i : nums2) b2[i] = true;
        for (int i : nums3) b3[i] = true;

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            boolean first = b1[i] && b2[i];
            boolean second = b2[i] && b3[i];
            boolean third = b1[i] && b3[i];
            if (first || second || third)
                result.add(i);
        }
        return result;
    }
}