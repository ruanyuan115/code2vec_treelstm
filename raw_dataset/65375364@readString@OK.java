String readString() throws IOException {
    while (!tok.hasMoreTokens()) {
        tok = new StringTokenizer(in.readLine());
    }
    return tok.nextToken();
}