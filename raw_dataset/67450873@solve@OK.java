public void solve(int testNumber, FastInput in, FastOutput out) {
    int n = in.readInt();
    int m = in.readInt();
    Node[] nodes = new Node[n + 1];
    for (int i = 1; i <= n; i++) {
        nodes[i] = new Node();
        nodes[i].id = i;
    }
    DigitBase base = new DigitBase(10);
    for (int i = 1; i <= m; i++) {
        Node a = nodes[in.readInt()];
        Node b = nodes[in.readInt()];
        Edge e = new Edge();
        e.a = a;
        e.b = b;
        e.len = i;
        a.next.add(e);
        b.next.add(e);
    }
    StringTree tree = new StringTree(0, 9, 1000000);
    TreeSet<Node> set = new TreeSet<>((a, b) -> {
        int ans = StringTree.TrieNode.compare(a.t, b.t);
        if (ans == 0) {
            ans = a.id - b.id;
        }
        return ans;
    });
    nodes[1].t = tree.getRoot();
    StringTree.TrieNode inf = tree.getMax();
    for (int i = 2; i <= n; i++) {
        nodes[i].t = inf;
    }
    set.add(nodes[1]);
    while (!set.isEmpty()) {
        Node head = set.pollFirst();
        for (Edge e : head.next) {
            Node node = e.other(head);
            StringTree.TrieNode trie = insert(tree, head.t, e.len);
            if (StringTree.TrieNode.compare(node.t, trie) <= 0) {
                continue;
            }
            set.remove(node);
            node.t = trie;
            set.add(node);
        }
    }
    for (int i = 2; i <= n; i++) {
        out.println(nodes[i].t.r);
    }
}