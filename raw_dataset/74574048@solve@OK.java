void solve(int TC) {
    int n = ni(), q = ni();
    int[] par = new int[n + 1], depth = new int[n + 1], si = new int[n + 1], ei = new int[n + 1];
    ArrayList<Integer>[] g = new ArrayList[n + 1];
    for (int i = 0; i < n - 1; i++) {
        int u = ni(), v = ni();
        if (g[u] == null)
            g[u] = new ArrayList<Integer>();
        if (g[v] == null)
            g[v] = new ArrayList<Integer>();
        g[u].add(v);
        g[v].add(u);
    }
    t = 0;
    dfs(1, 0, -1, par, si, ei, depth, g);
    for (int qu = 0; qu < q; qu++) {
        pair[] a = new pair[ni()];
        for (int i = 0; i < a.length; i++) {
            int u = ni();
            a[i] = new pair(u, depth[u]);
        }
        Arrays.parallelSort(a);
        for (int i = 0; i < a.length - 1; i++) if (a[i].u != 1)
            a[i].u = par[a[i].u];
        boolean ans = true;
        for (int i = 1; i < a.length; i++) {
            if (si[a[i - 1].u] <= si[a[i].u] && ei[a[i - 1].u] >= ei[a[i].u]) {
            } else
                ans = false;
        }
        pn(ans ? "YES" : "NO");
    }
}