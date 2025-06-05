class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        minCurrentBuy = prices[0] + 1

        for price in prices:
            if price < minCurrentBuy:
                minCurrentBuy = price
            else:
                currentprofit = price - minCurrentBuy
                if currentprofit > maxProfit:
                    maxProfit = currentprofit

        return maxProfit