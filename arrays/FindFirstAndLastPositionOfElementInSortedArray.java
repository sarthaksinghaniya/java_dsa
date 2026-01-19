class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if (nums.length == 0) {
            return ans; // edge case: empty array
        }

        ans[0] = firstOccurence(nums, target); // find first occurence
        ans[1] = lastOccurence(nums, target); // find last occurence

        return ans; // return the final answer
    }

    public int firstOccurence(int[] nums, int target) {
        int st = 0; // starting index
        int end = nums.length - 1; // inclusive
        int ans = -1; // default value if not found

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;      // move left
            } else if (target > nums[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans; // return first occurence
    }

    public int lastOccurence(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1; 
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] == target) {
                ans = mid;
                st = mid + 1;     
            } else if (target > nums[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans; // return last occurence
    }
}
