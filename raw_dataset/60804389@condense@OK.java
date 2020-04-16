public static int[][] condense(int[][] g, int[] clus) {
    int n = g.length;
    int m = 0;
    for (int i = 0; i < n; i++) m = Math.max(m, clus[i]);
    m++;
    int[] cp = new int[m];
    for (int i = 0; i < n; i++) {
        cp[clus[i]] += g[i].length;
    }
    int[][] c = new int[m][];
    for (int i = 0; i < m; i++) {
        c[i] = new int[cp[i]];
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < g[i].length; j++) {
            c[clus[i]][--cp[clus[i]]] = clus[g[i][j]];
        }
    }
    for (int i = 0; i < m; i++) {
        Arrays.sort(c[i]);
        int jp = 0;
        for (int j = 0; j < c[i].length; j++) {
            if ((j == 0 || c[i][j] != c[i][j - 1]) && c[i][j] != i) {
                c[i][jp++] = c[i][j];
            }
        }
        c[i] = Arrays.copyOf(c[i], jp);
    }
    return c;
}