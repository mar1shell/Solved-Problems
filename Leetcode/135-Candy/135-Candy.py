class Solution:
    def candy(self, ratings: List[int]) -> int:
        if len(ratings) == 1:
            return 1
        
        ratingsLen = len(ratings)
        candies = [1] * ratingsLen

        for i in range(1, ratingsLen):
            if ratings[i] > ratings[i - 1]:
                candies[i] = candies[i - 1] + 1
        
        count = candies[-1]

        for i in range(ratingsLen - 2, -1, -1):
            if ratings[i] > ratings[i + 1] and candies[i] <= candies[i + 1]:
                candies[i] = candies[i + 1]  + 1

            count += candies[i]

        return count