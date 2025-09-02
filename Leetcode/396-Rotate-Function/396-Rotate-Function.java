class Solution {
    public int maxRotateFunction(int[] nums) {
        int f0 = 0, numSum = 0;

        for (int i = 0; i < nums.length; i++) {
            f0 += i * nums[i];
            numSum += nums[i];
        }

        int maxF = f0, currF = f0;

        for (int i = 1; i < nums.length; i++) {
            currF += numSum - nums.length * nums[nums.length - i];
            maxF = Math.max(currF, maxF);
        }

        return maxF;
    }
}