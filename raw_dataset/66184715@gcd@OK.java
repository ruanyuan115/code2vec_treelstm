public static long gcd(long x, long y) {
    if (x == 0)
        return y;
    return gcd(y % x, x);
}