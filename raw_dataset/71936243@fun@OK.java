static void fun(int cur) {
    if (cur == k / 2) {
        long cnt = 0;
        for (int i = 1; i <= cur; i++) {
            long min = INF;
            for (int j = 0; j < d[even[i - 1]][even[i]].size(); j++) {
                Pair p = d[even[i - 1]][even[i]].get(j);
                if (used[p.v] == 0) {
                    min = p.d;
                    break;
                }
            }
            cnt += min;
        }
        ans = Math.min(ans, cnt);
        return;
    }
    for (int v = 0; v < n; v++) {
        even[cur] = v;
        used[v]++;
        fun(cur + 1);
        used[v]--;
    }
}