class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {  
            result = result * 2 + (n & 1);
            n = n >> 1;
        }

        return (int) result;
    }
}