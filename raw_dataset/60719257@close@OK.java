void close() {
    try {
        br.close();
    } catch (IOException e) {
    // throw new NoSuchElementException();
    }
}