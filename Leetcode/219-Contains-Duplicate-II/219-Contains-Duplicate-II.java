class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!seen.containsKey(nums[i])) {
                ArrayList<Integer> indexes = new ArrayList<>();
                
                indexes.add(i);
                seen.put(nums[i], indexes);
            } else {
                ArrayList<Integer> indexes = seen.get(nums[i]);
                
                for (int index : indexes) {
                    if (Math.abs(i - index) <= k) {
                        return true;
                    }
                }

                seen.get(nums[i]).add(i);
            }
        }

        return false;
    }
}