class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max1 = arrays.get(0).get(0), max2 = arrays.get(1).get(0), min1 = max1, min2 = max2, currMax, currMin;
        int indexMax1 = 0, indexMax2 = 0, indexMin1 = 0, indexMin2 = 0;
        boolean initialized = false;

        for (int i = 0; i < arrays.size(); i++) {
            currMin = arrays.get(i).get(0); 
            currMax = (arrays.size() > 0) ? arrays.get(i).get(arrays.get(i).size() - 1) : currMin;

            if (currMax >= max1) {
                if (initialized) {
                    max2 = max1;
                    indexMax2 = indexMax1;    
                }
                                
                max1 = currMax;
                indexMax1 = i;
            } else if (currMax > max2) {
                max2 = currMax;
                indexMax2 = i;
            }

            if (currMin <= min1) {
                if (initialized) {
                    min2 = min1;
                    indexMin2 = indexMin1;
                }
               
                min1 = currMin;
                indexMin1 = i;
            } else if (currMin < min2) {
                min2 = currMin;
                indexMin2 = i;
            }

            initialized = true;
        }

        if (indexMax1 != indexMin1) {
            return max1 - min1;
        }

        return Math.max(max1 - min2, max2 - min1);
    }
}