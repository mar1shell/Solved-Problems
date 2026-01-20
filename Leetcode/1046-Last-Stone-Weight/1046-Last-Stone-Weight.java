class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int first, second;

        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            first = queue.poll();
            second = queue.poll();

            if (first != second) {
                queue.offer(first - second);
            }
        }

        return (queue.isEmpty()) ? 0 : queue.poll();
    }
}