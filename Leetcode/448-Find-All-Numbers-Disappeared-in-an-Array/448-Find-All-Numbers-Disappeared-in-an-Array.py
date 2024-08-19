class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        arr = set(nums)
        result = []
        n = len(nums)
        for i in range(1, n + 1):
            if i not in arr:
                result.append(i)
        return result
