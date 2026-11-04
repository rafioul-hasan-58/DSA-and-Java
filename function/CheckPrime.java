
class CheckPrime {
    static void checkPrime(int x) {
        if (x != 2 && x % 2 == 0) {
            System.out.println(x + " " + "is not a prime");
        } else if (x != 3 && x % 3 == 0) {
            System.out.println(x + " " + "is not a prime");
        } else if (x != 5 && x % 5 == 0) {
            System.out.println(x + " " + "is not a prime");

        } else {
            System.out.println(x + " " + "is a prime number!");
        }
    }

    public static void main(String[] args) {
        checkPrime(0);
    }
}