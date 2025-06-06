class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        numsLength = len(nums)
        
        if numsLength <= 0:
            return []
        elif numsLength == 1:
            return [str(nums[0])]
        
        answer = []
        starting = 0

        for index in range(1, numsLength):
            if nums[index] == nums[index - 1] + 1:
                continue
            elif index == starting + 1:
                answer.append(str(nums[starting]))
            else:
                answer.append(f"{nums[starting]}->{nums[index - 1]}")

            starting = index

        if starting != len(nums) - 1:
            answer.append(f"{nums[starting]}->{nums[len(nums) - 1]}")
        else:
            answer.append(str(nums[starting]))

        return answer
