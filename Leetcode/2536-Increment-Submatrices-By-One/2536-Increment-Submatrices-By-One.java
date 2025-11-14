class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];

        for (int[] query: queries) {
            addOneToSubMatrix(matrix, query[0], query[2], query[1], query[3]);
        }

        return matrix;
    }

    private void addOneToSubMatrix
    (
        int[][] matrix, 
        int row1, 
        int row2, 
        int col1, 
        int col2
    ) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                matrix[i][j]++;
            }
        }
    }
}