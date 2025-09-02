class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xorSum = 0;

        for (var num : derived) {
            xorSum ^= num;
        }

        return (xorSum == 0) ? true : false;
    }
}