static void doMain(InputStream inStream, PrintStream outStream) {
    StringBuilder totalOut = new StringBuilder();
    int count = 1;
    // count = in.nextInt();
    while (count-- > 0) {
        try {
            StringBuilder out = new StringBuilder();
            new FTask(inStream, out).solve();
            totalOut.append(out.toString());
        } catch (QuickAnswer e) {
            totalOut.append(e.answer);
        }
        if (count > 0) {
            totalOut.append("\n");
        }
    }
    outStream.print(totalOut.toString());
}