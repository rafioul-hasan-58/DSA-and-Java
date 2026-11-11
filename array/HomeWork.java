package array;

public class HomeWork {

    static void sumOfArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is:" + " " + sum);
    }
    static void productOfArray(int[] arr) {
        int prod = 1;

        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }
        System.out.println("Product is:" + " " + prod);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        productOfArray(arr);
    }
}
