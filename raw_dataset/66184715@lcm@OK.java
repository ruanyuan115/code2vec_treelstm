public static long lcm(long x, long y) {
    return x / gcd(x, y) * y;
}