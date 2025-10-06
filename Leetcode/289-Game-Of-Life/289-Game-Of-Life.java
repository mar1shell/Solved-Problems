class Solution {
    public void gameOfLife(int[][] board) {
        int[][] bitMap = new int[board.length][board[0].length];
        int currAliveCount;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                currAliveCount = aliveNeighbors(board, bitMap, i, j);

                if (board[i][j] == 1 && (currAliveCount < 2 || currAliveCount > 3)) {
                    board[i][j] = 0;
                    bitMap[i][j] = 1;

                } else if (board[i][j] == 0 && currAliveCount == 3) {
                    board[i][j] = 1;
                    bitMap[i][j] = 1;
                }
            }
        }
    }

    public int aliveNeighbors(int[][] board, int[][] bitmap,int i, int j) {
        int rowStart, rowEnd, colStart, colEnd, aliveCount = 0;

        rowStart = (i > 0) ? i - 1 : i;
        rowEnd = (i < board.length - 1) ? i + 1 : i;
        colStart = (j > 0) ? j - 1 : j;
        colEnd = (j < board[0].length - 1) ? j + 1 : j;

        for (int k = rowStart; k <= rowEnd; k++) {
            for (int l = colStart; l <= colEnd; l++) {
                if (k != i || l != j) {
                    aliveCount += (bitmap[k][l] == 0) ? board[k][l] : (board[k][l] == 0) ? 1 : 0;
                }
            }
        }

        return aliveCount;
    }
}