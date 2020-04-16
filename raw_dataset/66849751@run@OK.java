@Override
public void run() {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    FastInput in = new FastInput(inputStream);
    FastOutput out = new FastOutput(outputStream);
    BTwoFairs solver = new BTwoFairs();
    int testCount = Integer.parseInt(in.next());
    for (int i = 1; i <= testCount; i++) solver.solve(i, in, out);
    out.close();
}