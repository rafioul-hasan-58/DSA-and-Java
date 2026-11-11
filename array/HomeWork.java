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

    static void swapMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[maxIdx];
        arr[maxIdx] = temp;

        System.out.println(java.util.Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        swapMinMax(arr);
    }
}
