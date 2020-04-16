private String next() {
    while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
        try {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return stringTokenizer.nextToken();
}