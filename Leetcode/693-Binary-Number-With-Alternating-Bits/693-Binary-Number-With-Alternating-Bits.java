class Solution {
    public boolean hasAlternatingBits(int n) {
        int temp = (n >> 1) ^ n; 
        return (temp & (temp + 1)) == 0;
    }
}