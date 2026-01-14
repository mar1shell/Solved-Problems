class Solution {
    public int[] finalPrices(int[] prices) {
        MonotonicStack stack = new MonotonicStack();
        int[] result = new int[prices.length];

        for (int i = prices.length - 1; i >= 0; i--) {
            result[i] = prices[i] - stack.discount(prices[i]);
        }

        return result;
    }

    private class MonotonicStack {
        Deque<Integer> stack;

        public MonotonicStack() {
            stack = new ArrayDeque<>();
        }

        public int discount(int price) {
            int currDiscount;

            while (!stack.isEmpty()) {
                currDiscount = stack.peek();

                if (currDiscount <= price) {
                    stack.push(price);

                    return currDiscount;
                }

                stack.pop();
            }

            stack.push(price);

            return 0;
        }
    }
}