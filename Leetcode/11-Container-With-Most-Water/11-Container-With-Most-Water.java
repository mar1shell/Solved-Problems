class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;

        while(i < j) {
            int currArea = Math.min(height[i], height[j]) * Math.abs(i - j);
            maxArea = Math.max(maxArea, currArea);

            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;

    }
}