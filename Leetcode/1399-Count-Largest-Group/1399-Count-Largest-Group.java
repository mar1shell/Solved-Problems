class Solution {
    private int MAX_SUM = 36;

    public int countLargestGroup(int n) {
        int[] groups = new int[MAX_SUM];

        for (int i = 1; i <= n; i++) {
            groups[sumDigits(i) - 1]++;
        }

        Arrays.sort(groups);

        int maxSum = groups[groups.length - 1], i = groups.length - 1, result = 0;

        while (groups[i] == maxSum) {
            result++;
            i--;
        }

        return result;
    }

    private int sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}