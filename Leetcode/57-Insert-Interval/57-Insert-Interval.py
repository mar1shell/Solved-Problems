class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        i = 0

        while i < len(intervals) and newInterval[0] > intervals[i][0]:
            i += 1

        intervals.insert(i, newInterval)

        i = 0

        while i < len(intervals) - 1:
            if intervals[i][1] < intervals[i + 1][0]:
                i += 1
            elif intervals[i][1] >= intervals[i + 1][1]:
                del intervals[i + 1]
            else:
                intervals[i][1] = intervals[i + 1][1]
                del intervals[i + 1]
            
        return intervals
         