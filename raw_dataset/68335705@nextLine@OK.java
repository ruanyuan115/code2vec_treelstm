public String nextLine() {
    try {
        return reader.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}