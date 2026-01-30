//leetcode problem 2529
class Solution {
    public int maximumCount(int[] nums) {
        int lastNegIndex = lastNegative(nums) + 1;       // number of negative numbers
        int firstPosIndex = nums.length - firstPositive(nums); // number of positive numbers

        return Math.max(lastNegIndex, firstPosIndex);
    }

    // Find index of last negative number
    public int lastNegative(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] < 0) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    // Find index of first positive number
    public int firstPositive(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }
}
