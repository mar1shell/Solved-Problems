class Solution {
    public int maxCoins(int[] piles) {
        int pilesLength = piles.length, coinsNumber = pilesLength / 3, maxCoins = 0;
        Arrays.sort(piles);

        for (int offset = 0; offset < coinsNumber; offset++) {
            maxCoins += piles[pilesLength - 2 - offset * 2];
        }

        return maxCoins;
    }
}