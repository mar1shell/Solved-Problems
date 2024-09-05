class Solution:
    def isRobotBounded(self, instructions: str) -> bool:
        initialDirection = 1j
        initialPosition = [0, 0]
        currDirection = 1j
        currPosition = [0, 0]
        for instr in instructions:
            if instr == 'L':
                currDirection *= 1j
            elif instr == 'R':
                currDirection *= -1j
            else:
                currPosition[0] += currDirection.real
                currPosition[1] += currDirection.imag
        if currPosition == initialPosition:
            return True
        elif currDirection != initialDirection:
            return True
        else:
            return False
