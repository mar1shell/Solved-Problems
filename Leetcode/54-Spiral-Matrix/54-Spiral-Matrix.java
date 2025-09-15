class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 0: east, 1: south, 2: west, 3: north
        int m = matrix.length, n = matrix[0].length, currDirection = 0, i = 0, j = 0;
        // [Jright, Ibottom, Jleft, Itop]
        int[] limits = {n, m, -1, 0};
        boolean traversed = true;

        while (traversed) {
            traversed = false;

            switch(currDirection) {
                case 0:
                    while (j < limits[0]) {
                        traversed = true;
                        answer.add(matrix[i][j]);
                        j++;
                    }
 
                    j--;
                    i++;
                    limits[0]--;

                    break;
                case 1:
                    while (i < limits[1]) {
                        traversed = true;
                        answer.add(matrix[i][j]);
                        i++;
                    }

                    i--;
                    j--;
                    limits[1]--;

                    break;
                case 2:
                    while (limits[2] < j) {
                        traversed = true;
                        answer.add(matrix[i][j]);
                        j--;
                    }

                    j++;
                    i--;
                    limits[2]++;

                    break;
                case 3:
                    while (limits[3] < i) {
                        traversed = true;
                        answer.add(matrix[i][j]);
                        i--;
                    }

                    i++;
                    j++;
                    limits[3]++;

            }

            currDirection = (currDirection + 1) % 4;
        }

        return answer;
    }
}