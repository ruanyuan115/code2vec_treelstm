public int compareTo(Pair p) {
    if (a != p.a)
        return (a - p.a);
    return (b - p.b);
}