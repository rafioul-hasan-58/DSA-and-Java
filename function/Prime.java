
class Prime {
    static boolean isPrime(int x) {
        if (x <= 1)
            return false;
        if (x == 2)
            return true;
        if (x % 2 == 0)
            return false;

        for (int i = 3; (long) i * i <= x; i += 2) {
            if (x % i == 0)
                return false;
        }

        return true;

    }

    static void printPrime(int x) {
        int i = 1;
        while (i < x) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printPrime(100);
    }
}