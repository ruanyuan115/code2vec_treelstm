char[][] nextMatrix(int n, int m) {
    char[][] map = new char[n][];
    for (int i = 0; i < n; i++) map[i] = next(m);
    return map;
}