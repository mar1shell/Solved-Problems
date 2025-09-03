class Solution {
    public void rotate(int[][] matrix) {
        this.transpose(matrix);
        this.reverseColumns(matrix);
    }

    private void transpose(int[][] matrix) {
        int n = matrix.length, temp;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverseColumns(int[][] matrix) {
        int n = matrix.length, temp;

        for (int j = 0; j < n / 2; j++) {
            for (int i = 0; i < n; i++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}