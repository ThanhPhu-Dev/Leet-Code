package easyCollection.array;

public class BestTimetoBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (minPrice < prices[i]) {
                profit += prices[i] - minPrice;
            }
            minPrice = prices[i];
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] input1 = {7, 1, 5, 3, 6, 4};
        int[] input2 = {1, 2, 3, 4, 5};
        int[] input3 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(input3));
    }
}
