class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<int[]> stack = new ArrayDeque<>();
        int maxSurface = 0, width, height;
        int[] popped;

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && stack.peek()[0] > heights[i]) {
                popped = stack.pop();
                height = popped[0];
                
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek()[1] - 1;
                }

                maxSurface = Math.max(maxSurface, height * width);
            }
            
            stack.push(new int[]{heights[i], i});
        }

        while (!stack.isEmpty()) {
            popped = stack.pop();
            height = popped[0];
            
            if (stack.isEmpty()) {
                width = heights.length;
            } else {
                width = heights.length - stack.peek()[1] - 1;
            }
            
            maxSurface = Math.max(maxSurface, height * width);
        }

        return maxSurface;
    }
}