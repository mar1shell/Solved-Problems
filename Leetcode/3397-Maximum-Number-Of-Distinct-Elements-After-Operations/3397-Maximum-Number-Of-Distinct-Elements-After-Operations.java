class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);

        int lastCalculatedNumber = nums[0] - k - 1;
        int maxDistinctNumbers = 0;

        for (int currNum: nums) {
            if (currNum + k > lastCalculatedNumber) {
                lastCalculatedNumber = Math.max(lastCalculatedNumber + 1, currNum - k);
                maxDistinctNumbers++;
            }
        } 

        return maxDistinctNumbers;
    }
}