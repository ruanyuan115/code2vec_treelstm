static long[] nextLongArray(int n) {
    long[] a = new long[n];
    int i = 0;
    while (i < n) {
        a[i++] = nextLong();
    }
    return a;
}