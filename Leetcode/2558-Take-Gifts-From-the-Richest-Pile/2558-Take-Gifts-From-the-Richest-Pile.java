class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(gifts.length, Collections.reverseOrder());
        long totalGifts = 0;

        for (int gift : gifts) {
            maxHeap.add(gift);
            totalGifts += gift;
        }

        for(int i = 0; i < k; i++) {
            int oldGiftsValue = maxHeap.poll();
            int newGiftsValue = (int) Math.sqrt(oldGiftsValue);

            totalGifts -= (oldGiftsValue - newGiftsValue);
            maxHeap.add(newGiftsValue);
        }
        
        return totalGifts;
    }
}