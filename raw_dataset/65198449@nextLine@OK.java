String nextLine() {
    try {
        return reader.readLine();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}