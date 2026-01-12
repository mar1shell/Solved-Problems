class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int currentX = points[0][0], currentY = points[0][1], minTime = 0;
        int targetX, targetY;
        
        for (int i = 1; i < points.length; i++) {
            targetX = points[i][0];
            targetY = points[i][1];

            while (targetX != currentX || targetY != currentY) {
                if (currentX < targetX && currentY < targetY) {
                    currentX++;
                    currentY++;
                } else if (currentX > targetX && currentY > targetY) {
                    currentX--;
                    currentY--;
                } else if (currentX > targetX && currentY < targetY) {
                    currentX--;
                    currentY++;
                } else if (currentX < targetX && currentY > targetY) {
                    currentX++;
                    currentY--;
                } else {
                    currentX += (currentX < targetX) ? 1 : (currentX > targetX) ? -1 : 0;
                    currentY += (currentY < targetY) ? 1 : (currentY > targetY) ? -1 : 0;
                }

                minTime++;
            }

            currentX = targetX;
            currentY = targetY;
        }

        return minTime;
    }
}