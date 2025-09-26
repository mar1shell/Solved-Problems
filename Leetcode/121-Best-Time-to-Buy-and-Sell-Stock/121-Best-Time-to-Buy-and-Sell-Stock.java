class Solution {
    public int maxProfit(int[] prices) {
        int pricesLength = prices.length, bestSellPrice = prices[pricesLength - 1];
        int maxProfit = 0;

        for (int i = pricesLength - 2; i >= 0; i--) {
            maxProfit = Math.max(maxProfit, bestSellPrice - prices[i]);
            bestSellPrice = Math.max(bestSellPrice, prices[i]);
        }

        return maxProfit;
    }
}