class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(
                nums1[a[0]] + nums2[a[1]], 
                nums1[b[0]] + nums2[b[1]]
            )
        );
        int[] current;

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            minHeap.offer(new int[]{i, 0});
        }

        for (int i = 0; i < k; i++) {
            current = minHeap.poll();
            result.add(new ArrayList<>(List.of(nums1[current[0]], nums2[current[1]])));

            System.out.printf("i = %d, j = %d\n", current[0], current[1]);

            if (current[1] + 1 < nums2.length) {
                minHeap.offer(new int[]{current[0], current[1] + 1});
            }
        }
       
        return result;
    }
}