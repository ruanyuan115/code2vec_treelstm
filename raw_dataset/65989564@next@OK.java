public String next() {
    if (st == null || !st.hasMoreTokens()) {
        try {
            st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
        }
    }
    return st.nextToken();
}