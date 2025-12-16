class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> missing = new TreeSet<>();

        for (int i = 1; i <= nums.length; i++) {
            missing.add(i);
        }

        for (int num : nums) {
            missing.remove(num);
        }

        List<Integer> result = new ArrayList<>(missing);

        return result;
    }
}