void dfs(int rt, int[] arr) {
    if (!ok)
        return;
    if (c[rt] >= arr.length) {
        ok = false;
        return;
    }
    set[rt] = arr[c[rt]];
    int p = 0;
    for (int u : g[rt]) {
        int[] ar = new int[sz[u]];
        int h = 0;
        for (int y = 0; y < sz[u]; ++y) {
            if (p == c[rt])
                p++;
            ar[y] = arr[p++];
        }
        dfs(u, ar);
    }
}