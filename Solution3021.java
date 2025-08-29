class Solution3021 {
    public long flowerGame(int n, int m) {

        long evenn = n / 2;
        long oddn = (n + 1) / 2;
        long evenm = m / 2;
        long oddm = (m + 1) / 2;

        return evenn * oddm + oddn * evenm;
    }
}