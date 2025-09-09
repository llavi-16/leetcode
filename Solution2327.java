class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        dp[1] = 1; 

        for (int day = 1; day <= n; day++) {
            long people = dp[day];
            if (people == 0) continue;

            for (int shareDay = day + delay; shareDay < day + forget && shareDay <= n; shareDay++) {
                dp[shareDay] = (dp[shareDay] + people) % MOD;
            }
        }

        long result = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            if (day >= 1) result = (result + dp[day]) % MOD;
        }

        return (int) result;
    }
}
