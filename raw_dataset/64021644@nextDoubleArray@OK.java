public double[] nextDoubleArray(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
    }
    return array;
}