class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> odd = new Stack<>(), even = new Stack<>();
        int temp, swapIndex;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                if (!even.empty()) {
                    temp = nums[i]; swapIndex = even.pop();
                    nums[i] = nums[swapIndex];
                    nums[swapIndex] = temp;
                } else {
                    odd.push(i);
                }
            } else if (i % 2 != 0 && nums[i] % 2 == 0) {
                if (!odd.empty()) {
                    temp = nums[i]; swapIndex = odd.pop();
                    nums[i] = nums[swapIndex];
                    nums[swapIndex] = temp;
                } else {
                    even.push(i);
                }
            }
        }

        return nums;
    }
}