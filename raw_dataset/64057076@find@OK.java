private static int find(int x) {
    if (f[x] == x)
        return x;
    return f[x] = find(f[x]);
}