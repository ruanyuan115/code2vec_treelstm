public static void unite(int x, int y) {
    x = find(x);
    y = find(y);
    if (x == y)
        return;
    par[x] = y;
}