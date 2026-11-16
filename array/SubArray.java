package array;

public class SubArray {
    static void maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int num : nums) {
            currSum += num;
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 2, -6, 3, -4 };
        maxSubArray(arr);
    }
}
