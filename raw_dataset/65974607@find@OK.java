int find(int x) {
    if (x == par[x]) {
        return x;
    }
    return (par[x] = find(par[x]));
}