String next() {
    while (st == null || !st.hasMoreElements()) try {
        st = new StringTokenizer(bf.readLine());
    } catch (IOException e) {
        e.printStackTrace();
    }
    return st.nextToken();
}