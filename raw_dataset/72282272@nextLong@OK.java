public long nextLong() {
    cnt = 1;
    boolean neg = false;
    if (c == NC)
        c = getChar();
    for (; (c < '0' || c > '9'); c = getChar()) {
        if (c == '-')
            neg = true;
    }
    long res = 0;
    for (; c >= '0' && c <= '9'; c = getChar()) {
        res = (res << 3) + (res << 1) + c - '0';
        cnt *= 10;
    }
    return neg ? -res : res;
}