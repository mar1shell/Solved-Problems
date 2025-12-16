class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, List<Integer>> prefix = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (prefix.containsKey(nums[i])) {
                prefix.get(nums[i]).add(i);
            } else {
                List<Integer> indexes = new ArrayList<>();
                
                indexes.add(i);
                prefix.put(nums[i], indexes);
            }
        }

        int count = 0, currCount;
        int[] result = new int[nums.length];

        for (Map.Entry<Integer, List<Integer>> entry : prefix.entrySet()) {
            currCount = count;

            for (int i : entry.getValue()) {
                result[i] = currCount;
                count++;
            }
        }

        return result;
    }
}