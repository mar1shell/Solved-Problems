class Solution {
    public int countOperations(int num1, int num2) {
        int numOperations = 0, temp;

        while (num1 != 0 && num2 != 0) {
            if (num1 <= num2) {
                temp = num2 / num1;

                numOperations += temp;
                num2 %= num1;
            } else {
                temp = num1 / num2;

                numOperations += temp;
                num1 %= num2;
            }
        }

        return numOperations;
    }
}