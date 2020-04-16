public String next() {
    while (!tokenizer.hasMoreTokens()) {
        try {
            tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return tokenizer.nextToken();
}