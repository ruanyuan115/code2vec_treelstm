public int[] nextArr(int n) throws IOException {
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
        res[i] = nextInt();
    }
    return res;
}