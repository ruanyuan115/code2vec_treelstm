static int[] nextIntArrayOneBased(int n) {
    int[] a = new int[n + 1];
    int i = 1;
    while (i <= n) {
        a[i++] = nextInt();
    }
    return a;
}