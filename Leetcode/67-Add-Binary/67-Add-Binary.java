class Solution {
    public String addBinary(String a, String b) {
        int currA = a.length() - 1, currB = b.length() - 1;
        int carry = 0, currentResult;
        StringBuilder result = new StringBuilder();

        while (currA >= 0 && currB >= 0) {
            currentResult = carry + (a.charAt(currA) - '0') + (b.charAt(currB) - '0');
            carry = currentResult / 2;
            currentResult %= 2;

            result.append(currentResult);
            currA--;
            currB--;
        }

        while (currA >= 0) {
            currentResult = carry + (a.charAt(currA) - '0');
            carry = currentResult / 2;
            currentResult %= 2;

            result.append(currentResult);
            currA--;
        }

        while (currB >= 0) {
            currentResult = carry + (b.charAt(currB) - '0');
            carry = currentResult / 2;
            currentResult %= 2;

            result.append(currentResult);
            currB--;
        }

        if (carry == 1) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}