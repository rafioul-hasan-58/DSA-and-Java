package array;

public class LeetCode {
    static void maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int currProfit = 0;
            for (int j = 0; j < prices.length; j++) {
                if (j <= i) {
                    continue;
                }
                int pro = prices[j] - prices[i];

                if (pro > 0) {
                    currProfit = Math.max(pro, currProfit);
                }
                if (pro < 0 && currProfit <= 0) {
                    currProfit = 0;
                }

            }
            maxProfit = Math.max(currProfit, maxProfit);
        }
        ;
        System.out.println(maxProfit);
    }

    static void maxProfit1(int[] prices) {
        int strIdx = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - prices[strIdx];
            maxProfit = Math.max(profit, maxProfit);
            if (prices[i] < prices[strIdx]) {
                strIdx = i;
            }
        }
        System.out.println(maxProfit);
    }

    static void mergeArray(int[] arr1, int m, int[] arr2, int n) {
        int[] newArray = new int[m + n];
        for (int i = 0; i < m; i++) {
            newArray[i] = arr1[i];
        }
        for (int i = m; i < newArray.length; i++) {
            newArray[i] = arr2[i - m];
        }
        java.util.Arrays.sort(newArray);
        System.out.println(java.util.Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] arr1 = { };
        int[] arr2 = { 2, 5, 6 };
        mergeArray(arr1, arr1.length, arr2, arr2.length);
    }
}
