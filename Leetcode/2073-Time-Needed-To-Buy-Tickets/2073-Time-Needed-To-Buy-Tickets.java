class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> queue = new ArrayDeque<>();
        int timeRequired = 0;
        int[] current;

        for (int i = 0; i < tickets.length; i++) {
            queue.offer(new int[]{i, tickets[i]});
        }

        while (true) {
            current = queue.poll();
            current[1]--;

            if (current[0] ==  k && current[1] == 0) {
                timeRequired++;
                break;    
            }

            if (current[1] != 0) {
                queue.offer(current);
            }

            timeRequired++;
        }

        return timeRequired;
    }
}