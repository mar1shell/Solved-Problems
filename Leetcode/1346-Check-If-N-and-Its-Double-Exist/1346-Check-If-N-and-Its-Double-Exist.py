class Solution(object):
    def checkIfExist(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        sett = set()
        for i in arr:
            if (2 * i in sett) or ((i % 2 == 0) and (i // 2 in sett)):
                return True
            else:
                sett.add(i)
        return False
