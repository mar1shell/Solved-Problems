class Solution {
    HashMap<Integer, Integer> memo;

    public int maximumJumps(int[] nums, int target) {
        this.memo = new HashMap<>();
        
        return maxJumpsRec(nums, nums[0], 1, target);   
    }

    public int maxJumpsRec(int[] nums, int currentValue, int start, int target) {
        int nextIndex = -1, key = currentValue * nums.length + start;
        
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        for (int i = start; i < nums.length; i++) {
            if (canJump(target, currentValue, nums[i])) {
                nextIndex = i;
                
                break;
            }
        }

        if (nextIndex == nums.length - 1) {
            memo.put(key, 1);
            
            return 1;
        }

        if (nextIndex == -1) {
            memo.put(key, -1);

            return -1;
        }

        int maxJump1 = maxJumpsRec(nums, nums[nextIndex], nextIndex + 1, target);
        int maxJump2 = maxJumpsRec(nums, currentValue, nextIndex + 1, target);
        
        if (maxJump1 == -1 && maxJump2 == - 1) {
            memo.put(key, -1);
            
            return -1;
        }

        int result = Math.max(maxJump1 + 1, maxJump2);

        memo.put(key, result);
        
        return result;
    }

    public boolean canJump(int target, int currentValue, int nextValue) {
        int diff = nextValue - currentValue;

        return diff >= -target && diff <= target;
    }
}