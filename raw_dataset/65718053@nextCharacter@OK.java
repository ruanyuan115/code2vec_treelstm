public char nextCharacter() {
    int c = read();
    while (isSpaceChar(c)) {
        c = read();
    }
    return (char) c;
}