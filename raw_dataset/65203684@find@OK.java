public static int find(int x) {
    return par[x] == x ? x : (par[x] = find(par[x]));
}