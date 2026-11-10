package bitwise;

public class HomeWork {
    static boolean powerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    // static boolean powerOfTwo(int n) {
    // if (n <= 0)
    // return false;
    // while (n % 2 == 0) {
    // n /= 2;
    // }
    // return n == 1;
    // }

    static int reverseInt(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        // System.out.println(powerOfTwo(12));
        System.out.println(reverseInt(1234));
    }
}
