public void readIntArrays(int[]... arrays) {
    for (int i = 0; i < arrays[0].length; i++) {
        for (int j = 0; j < arrays.length; j++) {
            arrays[j][i] = readInt();
        }
    }
}