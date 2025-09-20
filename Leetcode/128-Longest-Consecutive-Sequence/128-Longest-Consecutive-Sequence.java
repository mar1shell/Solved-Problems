class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                continue;
            }

            seen.add(num);      
        }

        int counter, i, maxSequence = 0;

        for (int start : seen) {
            if(seen.contains(start - 1)) {
                continue;
            }

            counter = 1; i = 1;

            while (seen.contains(start + i)) {
                counter++;
                i++;
            }

            maxSequence = Math.max(counter, maxSequence);
        }

        return maxSequence;
    }
}