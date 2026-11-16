package array;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int maxSum = 0;
        for (int st = 0; st < arr.length; st++) {
            int currSum = 0;
            for (int end = st; end < arr.length; end++) {
                currSum += arr[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println(maxSum);
    }
}
