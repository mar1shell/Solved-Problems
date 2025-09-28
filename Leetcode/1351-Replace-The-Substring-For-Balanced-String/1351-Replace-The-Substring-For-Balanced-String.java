class Solution {
    public int countNegatives(int[][] grid) {
        int negativesCount = 0, gridRows = grid.length, gridCols = grid[0].length;
        int currColsLimit = gridCols, currRowsCount, currColsCount, low, high, mid;

        for (int i = 0; i < gridRows; i++) {
            if (grid[i][0] < 0) {
                currRowsCount = gridRows - i;
                negativesCount += currRowsCount * currColsLimit;

                break;
            } else if (grid[i][currColsLimit - 1] >= 0) {
                continue;
            }

            low = 0; high = currColsLimit - 1;

            while (true) {
                mid = (high + low) / 2;

                if (grid[i][mid] >= 0 && grid[i][mid + 1] < 0) {
                    currRowsCount = gridRows - i;
                    currColsCount = currColsLimit - mid - 1;
                    negativesCount += currRowsCount * currColsCount;
                    currColsLimit = mid + 1;

                    break;
                } else if (grid[i][mid] >= 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

            return negativesCount;
    }
}