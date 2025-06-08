class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        gasProfit = [gas[index] - cost[index] for index in range(len(gas))]

        if sum(gasProfit) < 0:
            return -1
        
        gasProfitLength = len(gasProfit)
        currentIndex = 0
        started = False

        while True:
            if started:
                if currentIndex == startingIndex:
                    break
            
                currentProfit += gasProfit[currentIndex]

                if currentProfit < 0:
                    started = False
            elif gasProfit[currentIndex] >= 0:
                startingIndex = currentIndex
                started = True
                currentProfit = gasProfit[currentIndex]
            
            currentIndex = (currentIndex + 1) % gasProfitLength
        
        return startingIndex