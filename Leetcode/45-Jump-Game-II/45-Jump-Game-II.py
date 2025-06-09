class Solution:
    def jump(self, nums: List[int]) -> int:
        numsLen = len(nums)

        if numsLen <= 1:
            return 0

        start = 0
        count = 1
        maxReach = nums[start] + start

        while maxReach < numsLen - 1:
            for index in range(start, maxReach + 1):
                currentReach = index + nums[index]

                if currentReach > maxReach:
                    maxReach = currentReach
                    start = index

            maxReach = nums[start] + start
            count += 1
             
        return count