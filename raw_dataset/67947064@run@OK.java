@Override
public void run() {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    FastInput in = new FastInput(inputStream);
    FastOutput out = new FastOutput(outputStream);
    GSubsetWithZeroSum solver = new GSubsetWithZeroSum();
    int testCount = Integer.parseInt(in.next());
    for (int i = 1; i <= testCount; i++) solver.solve(i, in, out);
    out.close();
}