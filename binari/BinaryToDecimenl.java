package binari;

public class BinaryToDecimenl {
    static void makeDecimel(int binary) {
        int ans = 0;
        int pow = 1;
        while (binary > 0) {
            int lastDigit = binary % 10;
            ans += lastDigit * pow;
            binary /= 10;
            pow *= 2;
        }
        ;
        System.out.println("Decimel:" + " " + ans);
    }

    public static void main(String[] args) {
        makeDecimel(11000);
    }
}
