class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength], preSum = new int[numsLength], postSum = new int[numsLength];
        int currPreSum, currPostSum;

        for (int i = 1; i < numsLength; i++) {
            preSum[i] += preSum[i - 1] + nums[i - 1];
            postSum[numsLength - i - 1] += postSum[numsLength - i] + nums[numsLength - i];
        }

        for (int i = 0; i < numsLength; i++) {
            currPreSum = i * nums[i] - preSum[i];
            currPostSum = postSum[i] - (numsLength - i - 1) * nums[i];
            result[i] = currPreSum + currPostSum;
        }
 
        return result;
    }
}