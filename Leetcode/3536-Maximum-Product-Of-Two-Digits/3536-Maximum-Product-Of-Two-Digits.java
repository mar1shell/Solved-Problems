class Solution {
    public int maxProduct(int n) {
        int maxDigit = 0, secondMaxDigit = 0, temp, currentDigit;

        while (n > 0) {
            currentDigit = n % 10;

            if (currentDigit >= maxDigit) {
                secondMaxDigit = maxDigit;
                maxDigit = currentDigit;
            } else if (currentDigit >= secondMaxDigit) {
                secondMaxDigit = currentDigit;
            }

            n /= 10;
        }

        return maxDigit * secondMaxDigit;
    }
}