class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int misplacedOdd = 0, misplacedEven = 1, numsLength = nums.length, temp;

       while (misplacedOdd < numsLength && misplacedEven < numsLength) {
        while (misplacedOdd < numsLength && nums[misplacedOdd] % 2 == 0) {
            misplacedOdd += 2;
        }

        while (misplacedEven < numsLength && nums[misplacedEven] % 2 == 1) {
            misplacedEven += 2;
        }

        if (misplacedOdd < numsLength && misplacedEven < numsLength) {
            temp = nums[misplacedOdd];
            nums[misplacedOdd] = nums[misplacedEven];
            nums[misplacedEven] = temp;
        }
       }

       return nums;
    }
}