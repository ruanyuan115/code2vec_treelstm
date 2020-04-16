// [0,K),[K,N)
public static Node[] split(Node a, int K) {
    if (a == null)
        return new Node[] { null, null };
    if (K <= count(a.left)) {
        setParent(a.left, null);
        Node[] s = split(a.left, K);
        a.left = s[1];
        setParent(a.left, a);
        s[1] = update(a);
        return s;
    } else {
        setParent(a.right, null);
        Node[] s = split(a.right, K - count(a.left) - 1);
        a.right = s[0];
        setParent(a.right, a);
        s[0] = update(a);
        return s;
    }
}