static void union(int a, int b) {
    int c = find(a);
    int d = find(b);
    if (c == d)
        return;
    pairs += size[c] * size[d];
    if (size[c] >= size[d]) {
        size[c] += size[d];
        p[d] = c;
    } else {
        size[d] += size[c];
        p[c] = d;
    }
}