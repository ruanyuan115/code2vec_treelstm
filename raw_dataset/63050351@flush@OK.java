public FastOutput flush() {
    try {
        os.append(cache);
        cache.setLength(0);
    } catch (IOException e) {
        throw new UncheckedIOException(e);
    }
    return this;
}