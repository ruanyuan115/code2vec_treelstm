/*        Collections.sort(orders, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.diff < o2.diff) {
                    return -1;
                } else if (o1.diff > o2.diff) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });  */
static boolean isPrime(int n) {
    // Corner cases
    if (n <= 1)
        return false;
    if (n <= 3)
        return true;
    // middle five numbers in below loop
    if (n % 2 == 0 || n % 3 == 0)
        return false;
    for (int i = 5; i * i <= n; i = i + 6) if (n % i == 0 || n % (i + 2) == 0)
        return false;
    return true;
}