    class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(
                points,
                new Comparator<int[]>() {
                    @Override
                    public int compare(int[] arr1, int[] arr2) {
                        return Integer.compare(arr1[0], arr2[0]); 
                    }
                }
            );
            
            int[] currInterval = {points[0][0], points[0][1]};
            int minArrowCount = 0;
            int i = 0, j = 1;

            while (i < points.length && j < points.length) {
                if (currInterval[1] >= points[j][0]) {
                    currInterval[0] = Math.min(currInterval[0], points[j][0]);
                    currInterval[1] = Math.min(currInterval[1], points[j][1]);
                    j++;
                } else {
                    currInterval[0] = points[j][0];
                    currInterval[1] = points[j][1];
                    minArrowCount++;
                    i = j;
                    j++;
                }
            }

            minArrowCount++;

            return minArrowCount;
        }
    }