class Solution {
    public int maximumSum(int[] a) {
        int n = a.length;
        if (n == 1) return a[0];

        int noDel = a[0]; 
        int oneDel = 0;
        int res = a[0];

        for (int i = 1; i < n; i++) {
            oneDel = Math.max(noDel, oneDel + a[i]);
            noDel = Math.max(a[i], noDel + a[i]);

            res = Math.max(res, Math.max(noDel, oneDel));
        }
        return res;
    }
}
