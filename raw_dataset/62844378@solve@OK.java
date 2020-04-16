public void solve(int testNumber, FastInput in, FastOutput out) {
    int n = in.readInt();
    int m = in.readInt();
    Node[] nodes = new Node[n + 1];
    for (int i = 1; i <= n; i++) {
        nodes[i] = new Node();
        nodes[i].id = i;
    }
    Edge[] edges = new Edge[m];
    for (int i = 0; i < m; i++) {
        Edge edge = new Edge(nodes[in.readInt()], nodes[in.readInt()]);
        edge.a.next.add(edge);
        edge.b.next.add(edge);
        edges[i] = edge;
    }
    if (n == 1) {
        out.println(ONE_FOUR);
        return;
    }
    List<Circle> circles = new ArrayList<>(m);
    List<Node> stack = new ArrayList<>(n);
    dfsForCircle(nodes[1], null, circles, stack);
    int exp = 0;
    int loopContri = 0;
    int edgeContri = 0;
    int nodeContri = 0;
    for (Circle c : circles) {
        loopContri = mod.plus(loopContri, c.prob);
    }
    edgeContri = mod.mul(m, pow.pow(ONE_TWO, 2));
    nodeContri = mod.mul(n, pow.pow(ONE_TWO, 1));
    exp = mod.plus(loopContri, mod.subtract(nodeContri, edgeContri));
    int exp2 = 0;
    int loop2Contri = 0;
    int node2Contri = 0;
    int edge2Contri = 0;
    int loopNodeContri = 0;
    int loopEdgeContri = 0;
    int nodeEdgeContri = 0;
    int allCircleProbSum = 0;
    for (Circle c : circles) {
        allCircleProbSum = mod.plus(allCircleProbSum, pow.pow(ONE_TWO, c.nodes.size()));
    }
    for (Circle c : circles) {
        int local = 0;
        local = mod.plus(local, c.prob);
        local = mod.plus(local, mod.mul(c.prob, mod.subtract(allCircleProbSum, c.prob)));
        for (Node node : c.nodes) {
            local = mod.plus(local, mod.mul(c.prob, mod.subtract(node.probSum, c.prob)));
        }
        loop2Contri = mod.plus(loop2Contri, local);
    }
    node2Contri = mod.plus(node2Contri, mod.mul(n, ONE_TWO));
    node2Contri = mod.plus(node2Contri, mod.mul(mod.mul(n, n - 1), ONE_FOUR));
    for (Edge e : edges) {
        int local = ONE_FOUR;
        int related = e.a.next.size() + e.b.next.size() - 2;
        int unrelated = m - related - 1;
        local = mod.plus(local, mod.mul(related, pow.pow(ONE_TWO, 3)));
        local = mod.plus(local, mod.mul(unrelated, pow.pow(ONE_TWO, 4)));
        edge2Contri = mod.plus(edge2Contri, local);
    }
    for (Circle c : circles) {
        int related = c.nodes.size();
        int unrelated = n - related;
        int local1 = mod.mul(related, pow.pow(ONE_TWO, c.nodes.size()));
        int local2 = mod.mul(unrelated, pow.pow(ONE_TWO, c.nodes.size() + 1));
        int local = mod.plus(local1, local2);
        loopNodeContri = mod.plus(loopNodeContri, local);
    }
    loopNodeContri = mod.mul(loopNodeContri, 2);
    for (Circle c : circles) {
        int relatedEdge = 0;
        for (Node node : c.nodes) {
            relatedEdge += node.next.size() - 2;
        }
        int unrelatedEdge = m - c.nodes.size() - relatedEdge;
        int local1 = mod.mul(c.nodes.size(), c.prob);
        int local2 = mod.mul(relatedEdge, mod.mul(c.prob, ONE_TWO));
        int local3 = mod.mul(unrelatedEdge, mod.mul(c.prob, ONE_FOUR));
        int local = local1;
        local = mod.plus(local, local2);
        local = mod.plus(local, local3);
        loopEdgeContri = mod.plus(loopEdgeContri, local);
    }
    loopEdgeContri = mod.mul(loopEdgeContri, 2);
    nodeEdgeContri = mod.mul(2, ONE_FOUR);
    nodeEdgeContri = mod.plus(nodeEdgeContri, mod.mul(n - 2, pow.pow(ONE_TWO, 3)));
    nodeEdgeContri = mod.mul(nodeEdgeContri, m);
    nodeEdgeContri = mod.mul(nodeEdgeContri, 2);
    exp2 = mod.plus(exp2, loop2Contri);
    exp2 = mod.plus(exp2, node2Contri);
    exp2 = mod.plus(exp2, edge2Contri);
    exp2 = mod.plus(exp2, loopNodeContri);
    exp2 = mod.subtract(exp2, loopEdgeContri);
    exp2 = mod.subtract(exp2, nodeEdgeContri);
    int ans = mod.mul(exp, exp);
    ans = mod.subtract(exp2, ans);
    out.println(ans);
}