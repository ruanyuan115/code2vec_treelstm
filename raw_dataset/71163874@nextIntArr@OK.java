int[] nextIntArr(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = nextInt();
    }
    return arr;
}