package array;

public class Basic {
    static void smallestValue(int[] numbers) {
        int min = numbers[0];
        int mixIdx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                mixIdx = i;
            }
        }
        System.out.println(mixIdx);
    }

    static void largestValue(int[] numbers) {
        int max = numbers[0];
        int maxIdx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIdx=i;
            }
        }
        System.out.println(maxIdx);
    }

    public static void main(String[] args) {
        int[] numbers = { -12, 2, 34, 4, 25 };
        smallestValue(numbers);
        largestValue(numbers);
    }
}