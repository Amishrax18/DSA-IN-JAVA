class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            return 1 / power(x, -N);
        }
        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double half = power(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }
        return half * half * x;
    }
}