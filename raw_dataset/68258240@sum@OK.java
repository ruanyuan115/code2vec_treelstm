public long sum(int l, int r) {
    return sum(r) - sum(l - 1);
}