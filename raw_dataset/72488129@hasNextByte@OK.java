private boolean hasNextByte() {
    if (ptr < buflen) {
        return true;
    } else {
        ptr = 0;
        try {
            buflen = ins.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0) {
            return false;
        }
    }
    return true;
}