class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxBottles = 0, emptyBottles = 0;

        do {
            maxBottles += numBottles;
            emptyBottles += numBottles;
            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        } while (numBottles > 0);

        return maxBottles;
    }
}