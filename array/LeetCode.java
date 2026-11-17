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

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        maxProfit1(arr);
    }
}
