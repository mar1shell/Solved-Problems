class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) < 2:
            return 0

        isHoldingStock = False
        maxProfit = 0

        for i in range(len(prices)):        
            if isHoldingStock == True and prices[i] > currentBuyPrice and (i == len(prices) - 1 or prices[i] > prices[i + 1]):
                currentProfit = prices[i] - currentBuyPrice
                maxProfit += currentProfit
                isHoldingStock = False
            elif isHoldingStock == False and i < len(prices) - 1 and prices[i] < prices[i + 1]:
                currentBuyPrice = prices[i]
                isHoldingStock = True
            else:
                continue
        
        return maxProfit
