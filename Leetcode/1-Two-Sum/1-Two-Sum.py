class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        memo = {}
        for i in range(len(nums)):
            curr = nums[i]
            remainder = target - curr
            if remainder in memo:
                return [i, memo[remainder]]
            else: 
                memo[curr] = i
