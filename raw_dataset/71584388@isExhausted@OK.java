public boolean isExhausted() {
    int value;
    while (isSpaceChar(value = peek()) && value != -1) {
        read();
    }
    return value == -1;
}