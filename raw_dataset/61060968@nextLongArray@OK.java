public long[] nextLongArray(int n) {
    long[] ret = new long[n];
    for (int i = 0; i < n; i++) {
        ret[i] = nextLong();
    }
    return ret;
}