// delete K-th
public static Node erase(Node a, int K) {
    if (a == null)
        return null;
    if (K < count(a.left)) {
        a.left = erase(a.left, K);
        setParent(a.left, a);
        return update(a);
    } else if (K == count(a.left)) {
        setParent(a.left, null);
        setParent(a.right, null);
        Node aa = merge(a.left, a.right);
        disconnect(a);
        return aa;
    } else {
        a.right = erase(a.right, K - count(a.left) - 1);
        setParent(a.right, a);
        return update(a);
    }
}