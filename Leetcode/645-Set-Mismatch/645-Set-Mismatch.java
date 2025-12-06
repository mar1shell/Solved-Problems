class Solution {
    public int[] findErrorNums(int[] nums) {
        int numsLength = nums.length;
        Set<Integer> missing = new HashSet<>();
        int[] exists = new int[numsLength], result = new int[2];

        for (int i = 1; i <= nums.length; i++) {
            missing.add(i);
        }

        for (int num: nums) {
            if (exists[num - 1] == 1) {
                result[0] = num;  
            } else {
                exists[num - 1] = 1;
                missing.remove(num);
            }
        }

        result[1] = missing.iterator().next();

        return result;
    }
}