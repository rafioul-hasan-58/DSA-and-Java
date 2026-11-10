package bitwise;

public class HomeWork {
    static boolean powerOfTwo(int n) {
        if (n <= 0)
            return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
    // static boolean powerOfTwo(int n) {
    //     if (n <= 0)
    //         return false;
    //     while (n % 2 == 0) {
    //         n /= 2;
    //     }
    //     return n == 1;
    // }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(10));
    }
}
