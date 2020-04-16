static int nextPrime(int N) {
    // Base case
    if (N <= 1)
        return (2 - N);
    int prime = N;
    boolean found = false;
    // true for a number greater than n
    while (!found) {
        if (isPrime(prime)) {
            found = true;
            break;
        }
        prime++;
    }
    return (prime - N);
}