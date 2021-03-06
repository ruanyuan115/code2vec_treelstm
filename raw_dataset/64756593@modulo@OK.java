/**
 * *********************************MODULAR EXPONENTIATION**********************************************
 */
static long modulo(long a, long b, long c) {
    long x = 1;
    long y = a % c;
    while (b > 0) {
        if (b % 2 == 1) {
            x = (x * y) % c;
        }
        // squaring the base
        y = (y * y) % c;
        b /= 2;
    }
    return x % c;
}