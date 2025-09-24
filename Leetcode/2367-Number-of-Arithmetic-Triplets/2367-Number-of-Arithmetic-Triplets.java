class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> seen = new HashSet<>();
        int counter = 0;

        for (int num: nums) {
            seen.add(num);
        }

        for (int num: nums) {
            if (seen.contains(num + diff) && seen.contains(num + 2 * diff)) {
                counter++;
            }
        }

        return counter;
    }
}