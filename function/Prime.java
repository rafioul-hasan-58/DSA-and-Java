
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

    public static void main(String[] args) {
        int n = 65;
        System.out.println(n + (isPrime(n) ? " is a prime number!" : " is not a prime"));
    }
}