class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        
        int counter = 1, maxSequence = 0;
        
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            
            if (nums[i] == nums[i - 1] + 1) {
                counter++;
            } else {
                maxSequence = Math.max(counter, maxSequence);
                counter = 1;
            }
        }

        maxSequence = Math.max(counter, maxSequence);

        return maxSequence;
    }
}