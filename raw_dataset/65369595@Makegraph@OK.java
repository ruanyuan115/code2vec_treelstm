/**
 * ***************************************Graph********************************************************
 */
static void Makegraph(int n) {
    graph = new ArrayList[n];
    for (int i = 0; i < n; i++) {
        graph[i] = new ArrayList<>();
    }
}