class Solution {
    private int[][][] memo;

    private class stringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    }

    public int findMaxForm(String[] strs, int m, int n) {
        memo = new int[strs.length][m + 1][n + 1];
        
        Arrays.sort(strs, new stringLengthComparator());
        
        return findMaxFormRec(strs, 0, m, n); 
    }

    private int findMaxFormRec(
        String[] strs,
        int currentStringIndex,
        int m, 
        int n
        ) {
        if (currentStringIndex >= strs.length) {
            return 0;
        }

        if (memo[currentStringIndex][m][n] != 0) {
            return memo[currentStringIndex][m][n];
        }

        String currentString = strs[currentStringIndex];
        int[] counts = zeroesAndOnesCounter(currentString);
        int zeroesCount = counts[0], onesCount = counts[1];
        
        int skip = findMaxFormRec(strs, currentStringIndex + 1, m, n); 
        int take = 0;

        if (zeroesCount <= m && onesCount <= n) {
            take = 1 + findMaxFormRec(strs, currentStringIndex + 1, m - zeroesCount, n - onesCount);

        }

        int result = Math.max(take, skip);

        memo[currentStringIndex][m][n] = result;

        return result;
    }

    private int[] zeroesAndOnesCounter(String str) {
        int zeroesCounter = 0, onesCounter = 0;
        
        for (char currChar: str.toCharArray()) {
            if (currChar == '1') {
                onesCounter++;
            } else {
                zeroesCounter++;
            }
        }

        return new int[] {zeroesCounter, onesCounter};
    }
}