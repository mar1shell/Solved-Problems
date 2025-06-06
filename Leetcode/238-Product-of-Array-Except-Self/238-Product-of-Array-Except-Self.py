class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = [1]
        suffix = [1]
        answers = []

        for i in range(1, len(nums)):
            prefix.append(prefix[i - 1] * nums[i - 1])
            suffix.append(suffix[i - 1] * nums[len(nums) - i])

        for i in range(len(nums)):
            answers.append(prefix[i] * suffix[len(nums) - i - 1])

        return answers