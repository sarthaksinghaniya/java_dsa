class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert the integer to a string
        int left = 0, right = s.length() - 1;// Initialize two pointers, one at the start and one at the end of the string

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++; // Move the left pointer to the right
            right--;  // Move the right pointer to the left
        }
        return true; // If we have checked all characters and they are the same, return true
    }
}
