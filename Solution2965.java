class Solution2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        int[] result = new int[2];

        // Count each number's frequency
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        // Identify repeated and missing
        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 2) result[0] = i; // repeated
            if (count[i] == 0) result[1] = i; // missing
        }

        return result;
    }
}
