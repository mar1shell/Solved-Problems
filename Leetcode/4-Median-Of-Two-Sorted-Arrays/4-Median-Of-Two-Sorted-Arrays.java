class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] smallNums = nums1, bigNums = nums2;
        int left, right, mid1, mid2, maxLeft1, maxLeft2, minRight1, minRight2;
        int nums1Length = nums1.length, nums2Length = nums2.length;
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        double median;

        if (nums1Length > nums2Length) {
            smallNums = nums2; bigNums = nums1;
        }

        left = 0; right = smallNums.length;

        while (true) {
            mid1 = (left + right) / 2;
            mid2 = (nums1Length + nums2Length + 1) / 2 - mid1;
            maxLeft1 = (mid1 == 0) ? min : smallNums[mid1 - 1];
            maxLeft2 = (mid2 == 0) ? min : bigNums[mid2 - 1];
            minRight1 = (mid1 == smallNums.length) ? max : smallNums[mid1];
            minRight2 = (mid2 == bigNums.length) ? max : bigNums[mid2];            
            
            if (maxLeft1 > minRight2) {
                right = mid1 - 1;
            } else if (maxLeft2 > minRight1){
                left = mid1 + 1;
            } else {
                break;
            }
        }

        median = Math.max(maxLeft1, maxLeft2);
        
        if ((nums1Length + nums2Length) % 2 == 0) {
            median = (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
        }

        return median;
    }
}