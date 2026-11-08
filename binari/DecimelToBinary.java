package binari;

public class DecimelToBinary {
    static void makeBinary(int n) {
        int ans = 0;
        int pow = 1;
        while (n > 0) {
            int rem = n % 2;
            n /= 2;
            ans += (rem * pow);
            pow *= 10;
        }
        ;
        System.out.println("Binary:" + " " + ans);
    }

    public static void main(String[] args) {
        makeBinary(19);
    }
}
