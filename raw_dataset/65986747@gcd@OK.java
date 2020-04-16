static long gcd(long a, long b) {
    if (a > b)
        return gcd(b, a);
    if (a == 0)
        return b;
    return gcd(b % a, a);
}