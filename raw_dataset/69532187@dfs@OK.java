public static ArrayList<Node> dfs(int x) {
    ArrayList<Node> list = new ArrayList();
    for (int v : adj[x]) {
        ArrayList<Node> ll = dfs(v);
        if (ll == null)
            return null;
        list.addAll(ll);
    }
    int l = list.size();
    if (l < val[x])
        return null;
    if (l == 0)
        list.add(new Node(x, ++tmp));
    else {
        Collections.sort(list);
        int p = 0;
        if (val[x] == 0)
            p = list.get(val[x]).num;
        else
            p = list.get(val[x] - 1).num + 1;
        list.add(val[x], new Node(x, p));
        tmp++;
    }
    l++;
    for (int i = val[x] + 1; i < l; i++) list.get(i).num++;
    return list;
}