public int[] nextIntArray(int n) {
    int[] ret = new int[n];
    for (int i = 0; i < n; i++) {
        ret[i] = nextInt();
    }
    return ret;
}