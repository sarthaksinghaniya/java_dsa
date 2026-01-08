import java.util.HashMap;
import java.util.Map;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        // Return empty array if no solution found (LeetCode guarantees one solution though)
        return new int[] {};
    }
}
