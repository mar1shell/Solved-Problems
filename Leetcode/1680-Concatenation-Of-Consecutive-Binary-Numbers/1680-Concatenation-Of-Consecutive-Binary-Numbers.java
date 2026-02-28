class Solution {
    public int concatenatedBinary(int n) {
        long modulo = (long)Math.pow(10, 9) + 7;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result <<= bitsCounter(i);
            result += i;
            result %= modulo;
        }

        return (int)result;
    }

    private int bitsCounter(int n) {
        return Integer.SIZE - Integer.numberOfLeadingZeros(n);
    }
}