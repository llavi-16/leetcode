class Solution1304 {
    public int[] sumZero(int n) {
        // even
        int[] res = new int[n];
        int in = 0;
        for (int i = 1; i <= n / 2; i++) {
            res[in++] = -i;
            res[in++] = i;
        }
        // odd
        if (n % 2 == 1) {
            res[in] = 0;

        }
        return res;
    }
}