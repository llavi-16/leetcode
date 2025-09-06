class Solution3495 {
    // Helper function: computes sum of steps(x) for x = 1..n
    private long prefixSum(long n) {
        if (n <= 0) return 0;

        long sum = 0;
        long start = 1;   // block start
        int step = 1;     // step value for this block

        // Each block: [start, 4*start - 1] has the same step value
        while (start <= n) {
            long end = Math.min(n, 4 * start - 1); // block end or n
            long count = end - start + 1;          // numbers in this block
            sum += count * step;                   // add contribution

            start *= 4; // next block starts
            step++;     // step increases
        }
        return sum;
    }

    public long minOperations(int[][] queries) {
        long total = 0;

        for (int[] q : queries) {
            long l = q[0], r = q[1];
            // total steps needed in range [l, r]
            long stepsSum = prefixSum(r) - prefixSum(l - 1);

            // each operation handles 2 numbers -> ceil(stepsSum/2)
            total += (stepsSum + 1) / 2;
        }

        return total;
    }
}
