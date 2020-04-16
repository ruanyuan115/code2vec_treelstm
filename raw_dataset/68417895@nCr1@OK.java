static long nCr1(int n, int k) {
    if (n < k)
        return 0;
    if (k == 0 || k == n)
        return 1;
    if (comb[n][k] != -1)
        return comb[n][k];
    if (n - k < k)
        return comb[n][k] = nCr1(n, n - k);
    return comb[n][k] = (nCr1(n - 1, k - 1) + nCr1(n - 1, k)) % mod;
}