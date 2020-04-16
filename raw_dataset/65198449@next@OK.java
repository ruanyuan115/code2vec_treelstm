String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
            tokenizer = new StringTokenizer(reader.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    return tokenizer.nextToken();
}