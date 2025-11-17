class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Split numbers into negative and positive
        for (int num : nums) {
            if (num < 0) neg.add(num);
            else pos.add(num);
        }

        // Case 1: Only positive
        if (neg.isEmpty()) {
            for (int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        // Case 2: Only negative
        if (pos.isEmpty()) {
            for (int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg); // Reverse after squaring
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        // Square all negative numbers and reverse once
        for (int i = 0; i < neg.size(); i++) {
            neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);

        // Square all positives
        for (int i = 0; i < pos.size(); i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }

        // Merge like merge sort
        int i = 0, j = 0, idx = 0;
        int n1 = neg.size(), n2 = pos.size();
        int[] res = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j)) {
                res[idx++] = neg.get(i++);
            } else {
                res[idx++] = pos.get(j++);
            }
        }

        // Add remaining elements
        while (i < n1) res[idx++] = neg.get(i++);
        while (j < n2) res[idx++] = pos.get(j++);

        return res;
    }
}
