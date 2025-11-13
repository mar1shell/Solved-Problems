class Solution {
    public int maxOperations(String s) {
        int currentOnes = 0, result = 0;
        boolean flag = true;

        for (char currChar: s.toCharArray()) {
            if (currChar == '1') {
                currentOnes++;
                flag = true;
            } else if (flag) {
                result += currentOnes;
                flag = false;
            }
        }

        return result;
    }
}