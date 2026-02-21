class Solution {
    
    public int countPrimeSetBits(int left, int right) {
        // biggest prime set of bits in numbers < 10^6 is 19
        Set<Integer> PRIMES = new HashSet<>(Set.of(2, 3, 5, 7, 11, 13, 17, 19));
        int count = 0, currSetBits;

        for (int i = left; i <= right; i++) {
            currSetBits = countSetBits(i);

            count = (PRIMES.contains(currSetBits)) ? count + 1 : count;
        }

        return count;
    }

    private int countSetBits(int n) {
        int setBitsCount = 0;

        while (n > 0) {
            setBitsCount = (n % 2 == 1) ? setBitsCount + 1 : setBitsCount;

            n /= 2;
        }

        return setBitsCount;
    }
}