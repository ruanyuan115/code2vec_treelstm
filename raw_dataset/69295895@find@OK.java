static int find(int a) {
    if (parent[a] == a)
        return a;
    parent[a] = find(parent[a]);
    return parent[a];
}