public void findToken() {
    while (st == null || !st.hasMoreTokens()) {
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}