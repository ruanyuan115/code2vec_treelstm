int[] nextIntArray(int n) throws IOException {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = in.nextInt();
    return a;
}