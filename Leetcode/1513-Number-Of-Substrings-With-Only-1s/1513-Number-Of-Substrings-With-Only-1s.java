class Solution {
    public int numSub(String s) {
        long totalSubstrings = 0, currCount = 0;
        boolean isOnesSubstring = false;

        for (char currChar: s.toCharArray()) {
           if (currChar == '1') {
            currCount++;
            isOnesSubstring = true;
           } else if (isOnesSubstring && currChar == '0') {
            totalSubstrings += (currCount * (currCount + 1)) / 2;
            isOnesSubstring = false;
            currCount = 0;
           }
        }

        if (currCount != 0) {
            totalSubstrings += (currCount * (currCount + 1)) / 2;
        }

        totalSubstrings %= (Math.pow(10, 9) + 7);
        
        return (int) totalSubstrings;
    }
}