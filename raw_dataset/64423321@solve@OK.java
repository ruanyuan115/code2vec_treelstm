static int solve(int n, HashSet<Integer>[] g) {
    DSU dsu = new DSU(n);
    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
        a[i] = i;
    }
    BitSet[] bitSet = new BitSet[n];
    Arrays.sort(a, (x, y) -> g[x].size() - g[y].size());
    int edges = 0;
    for (int u : a) {
        if (edges == n - 1)
            break;
        int p = dsu.find(u);
        if (bitSet[p] == null)
            bitSet[u] = new BitSet(n);
        else
            bitSet[u] = bitSet[p];
        bitSet[u].set(u);
        for (int i = 0; i < n; i = bitSet[u].nextClearBit(i + 1)) {
            if (u == i || dsu.equiv(u, i) || g[u].contains(i))
                continue;
            edges++;
            int c = dsu.find(i);
            if (bitSet[c] != null)
                bitSet[u].or(bitSet[c]);
            else
                bitSet[u].set(i);
            bitSet[dsu.find(u)] = bitSet[u];
            dsu.union(u, i);
        }
    }
    return (n - 1) - edges;
}