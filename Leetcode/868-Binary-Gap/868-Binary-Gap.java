class Solution {
    public int binaryGap(int n) {
        int maxDistance = 0, currDistance = 0, currBit;
        boolean flag = false;

        while (n > 0) {
            currBit = n % 2;
            
            if (currBit == 0 && flag) {
                currDistance++;
            } else if (currBit == 1 && flag) {
                currDistance++;
                maxDistance = Math.max(maxDistance, currDistance);
                currDistance = 0;
            } else if (currBit == 1 && !flag) {
                flag = true;
            }

            n /= 2;
        }

        return maxDistance;
    }
}