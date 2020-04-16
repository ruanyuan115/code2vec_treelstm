long[] shuffle(long[] arr) {
    Random r = new Random();
    for (int i = 1, j; i < arr.length; i++) {
        j = r.nextInt(i);
        long c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
    return arr;
}