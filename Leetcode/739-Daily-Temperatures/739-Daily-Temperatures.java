class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        MonotonicStack stack = new MonotonicStack();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            result[i] = stack.daysUntilGreaterTemperature(temperatures[i], i);
        }

        return result;
    }

    private class MonotonicStack {
        Deque<int[]> stack; // Temperature, day 

        public MonotonicStack() {
            stack = new ArrayDeque<>();
        }

        public int daysUntilGreaterTemperature(int temperature, int day) {
            int[] currGreaterTemperature, currTemperature = {temperature, day};

            while (!stack.isEmpty()) {
                currGreaterTemperature = stack.peek();

                if (currGreaterTemperature[0] > temperature) {
                    
                    stack.push(currTemperature);

                    return currGreaterTemperature[1] - day;
                }

                stack.pop();
            }

            stack.push(currTemperature);

            return 0;
        }
    }
}