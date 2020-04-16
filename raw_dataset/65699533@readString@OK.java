private String readString() throws IOException {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        tokenizer = new StringTokenizer(reader.readLine());
    }
    return tokenizer.nextToken();
}