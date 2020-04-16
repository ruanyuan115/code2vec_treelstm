/**
 * Reads the input bytes until it encounters a new line char.
 * @return
 * @throws IOException
 */
public String readLine() throws IOException {
    byte[] buf = new byte[64];
    int cnt = 0, c;
    while ((c = read()) != -1) {
        if (c == '\n')
            break;
        buf[cnt++] = (byte) c;
    }
    return new String(buf, 0, cnt);
}