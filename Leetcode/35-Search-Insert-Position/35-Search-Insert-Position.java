class Solution {
    public int searchInsert(int[] nums, int target) {
        int numsLength = nums.length, left = 0, right = numsLength - 1, mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (nums[mid] > target) ? mid : mid + 1;
    }
}