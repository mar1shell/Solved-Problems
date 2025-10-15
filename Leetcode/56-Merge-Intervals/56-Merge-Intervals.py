class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        sortedIntervals = sorted(intervals, key=lambda x: x[0])
        i = 0
        j = 1

        while j < len(sortedIntervals):
            if sortedIntervals[i][1] < sortedIntervals[j][0]:
                i += 1
                j += 1
            else:
                sortedIntervals[i][1] = max(sortedIntervals[j][1], sortedIntervals[i][1])
                del sortedIntervals[j]

        return sortedIntervals

