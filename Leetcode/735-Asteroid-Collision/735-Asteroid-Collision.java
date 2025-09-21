class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<int[]> positive = new Stack<>();
        Stack<int[]> negative = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int[] curr = {asteroids[i], i};
            
            if (asteroids[i] > 0 ) {
                positive.push(curr);
            } else {
                negative.push(curr);
            }
            
            while (!negative.isEmpty() && !positive.isEmpty() && positive.peek()[1] < negative.peek()[1]) {
                if (positive.peek()[0] > Math.abs(negative.peek()[0]  )) {
                    negative.pop();
                } else if (positive.peek()[0] < Math.abs(negative.peek()[0])) {
                    positive.pop();
                } else {
                    negative.pop();
                    positive.pop();
                }
            }
        }

        int[] answer = new int[positive.size() + negative.size()];
        int i = positive.size() + negative.size() - 1;

        while (i >= 0) {
            if (!positive.isEmpty() && !negative.isEmpty()) {
                if (positive.peek()[1] > negative.peek()[1]) {
                    answer[i--] = positive.pop()[0];
                } else {
                    answer[i--] = negative.pop()[0];
                }
            } else if (!positive.isEmpty()) {
                answer[i--] = positive.pop()[0];
            } else {
                answer[i--] = negative.pop()[0];
            }
        }

        return answer;
    }
}