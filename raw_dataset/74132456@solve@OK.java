static int solve(ArrayList<Integer> cycleL) {
    int[] a = new int[cycleL.size()];
    for (int i = 0; i < a.length; i++) a[i] = cycleL.get(i);
    int best = 1000000000;
    for (int factor = 1; factor <= a.length; factor++) {
        if (a.length % factor != 0)
            continue;
        outer: for (int start = 0; start < factor; start++) {
            for (int i = start; i < a.length; i += factor) if (a[i] != a[start])
                continue outer;
            best = Math.min(best, factor);
        }
    }
    return best;
}