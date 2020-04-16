public int scan() throws IOException {
    if (total < 0)
        throw new InputMismatchException();
    if (index >= total) {
        index = 0;
        total = in.read(buf);
        if (total <= 0)
            return -1;
    }
    return buf[index++];
}