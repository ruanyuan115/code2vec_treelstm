int[] nextArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
        array[i] = nextInt();
    }
    return array;
}