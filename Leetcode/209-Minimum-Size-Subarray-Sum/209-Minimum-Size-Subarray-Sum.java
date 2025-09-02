class Solution {
    public int minSubArrayLen(int target, int[] nums) { 
        int currSum = nums[0], minLen = nums.length + 1, left = 0, right = 0;

        while(right < nums.length && left <= right) {
            if (currSum < target) {
                right++;

                if (right < nums.length) {
                    currSum += nums[right];
                }
            } else {
                minLen = Math.min(minLen, right - left + 1);
                currSum -= nums[left++];
            } 
        }

        return (minLen == nums.length + 1) ? 0 : minLen;
    }
}