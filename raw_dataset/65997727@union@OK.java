static void union(int a, int b) {
    a = find(a);
    b = find(b);
    if (a != b) {
        parent[b] += parent[a];
        parent[a] = b;
    }
}