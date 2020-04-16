public final String readString() throws IOException {
    int c = read();
    while (isSpaceChar(c)) {
        c = read();
    }
    StringBuilder res = new StringBuilder();
    do {
        res.append((char) c);
        c = read();
    } while (!isSpaceChar(c));
    return res.toString();
}