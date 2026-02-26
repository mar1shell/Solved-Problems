class Solution {
    public int numSteps(String s) {
        boolean carry = false;
        int steps = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (!carry && s.charAt(i) == '0') {
                steps++;
            } else if (!carry && s.charAt(i) == '1' && i != 0) {
                steps = steps + 2;
                carry = true;
            } else if (carry && s.charAt(i) == '1') {
                steps++;
            } else if (carry && s.charAt(i) == '0') {
                steps = steps + 2;
            }
        }

        return steps;
    }
}