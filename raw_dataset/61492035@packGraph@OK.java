public static int[][] packGraph(int[] from, int[] to, int n, int m) {
    int[][] g = new int[n + 1][];
    int[] p = new int[n + 1];
    for (int i = 0; i < m; i++) p[from[i]]++;
    for (int i = 0; i < m; i++) p[to[i]]++;
    for (int i = 0; i <= n; i++) g[i] = new int[p[i]];
    for (int i = 0; i < m; i++) {
        g[from[i]][--p[from[i]]] = to[i];
        g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
}