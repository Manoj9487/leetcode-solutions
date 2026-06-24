class Solution {
    static int MOD = 1000000007;

    private long fastPower(long base, long pow) {
        long res = 1;
        base %= MOD;

        while(pow > 0) {
            if (pow % 2 == 1) {
                res = (res * base) % MOD;
                pow = pow - 1;
            }
            else {
                base = (base * base) % MOD;
                pow = pow / 2;
            }
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = fastPower(5, evenPositions);
        long oddWays = fastPower(4, oddPositions);

        return (int)((evenWays * oddWays) % MOD);
    }
}
