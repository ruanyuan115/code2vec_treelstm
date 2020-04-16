private static void dfsBC(int cur, BCDatum d) {
    d.visited[cur] = true;
    d.low[cur] = d.ord[cur] = d.gen++;
    int dfsch = 0;
    for (int[] e : d.g[cur]) {
        if (!d.visited[e[0]]) {
            d.edgeStack[d.esp++] = e[1];
            d.parente[e[0]] = e[1];
            dfsch++;
            dfsBC(e[0], d);
            if (d.low[e[0]] >= d.ord[cur]) {
                d.isArtic[cur] = true;
                while (d.esp > 0) {
                    d.edgeClus[d.edgeStack[--d.esp]] = d.ecp;
                    if (d.edgeStack[d.esp] == e[1])
                        break;
                }
                d.ecp++;
            }
            d.low[cur] = Math.min(d.low[cur], d.low[e[0]]);
        } else if (d.parente[cur] != e[1] && d.ord[e[0]] < d.ord[cur]) {
            // e is a back edge from cur to its ancestor e[0]
            d.edgeStack[d.esp++] = e[1];
            d.low[cur] = Math.min(d.low[cur], d.ord[e[0]]);
        }
    }
    // if root node and degree on dfs tree = 1 then not articulation point.
    if (d.parente[cur] < 0 && dfsch == 1)
        d.isArtic[cur] = false;
}