public long[][] nextLongMap(int n, int m) {
    long[][] map = new long[n][m];
    for (int i = 0; i < n; i++) {
        map[i] = nextLongArray(m);
    }
    return map;
}