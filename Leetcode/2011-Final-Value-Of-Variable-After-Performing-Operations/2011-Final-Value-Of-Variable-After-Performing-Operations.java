class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int finalValue = 0;

        for (String operation: operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                finalValue++;
            } else {
                finalValue--;
            }
        }

        return finalValue;
    }
}