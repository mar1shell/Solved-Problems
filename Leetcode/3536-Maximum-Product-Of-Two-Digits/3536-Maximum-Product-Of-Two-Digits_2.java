class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> maxDigits = new PriorityQueue<>(Collections.reverseOrder());

        while (n > 0) {
            maxDigits.add(n % 10);
            n /= 10;
        }

        return maxDigits.poll() * maxDigits.poll();
    }
}