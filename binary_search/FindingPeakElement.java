// Time Complexity : O(log n)
// Leetcode Problem 162. Find Peak Element
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1 ){
            return 0 ; // only one element

        }else if( nums[0] > nums[1]){
            return 0 ; // first element is peak
        }else if(nums[nums.length - 1] > nums[nums.length - 2]){
            return nums.length -1 ;    // last element is peak
        }else{
            int st = 1 ;
            int end = nums.length - 2 ;

            while(st<=end){
                int mid = (st + end) / 2;
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid + 1]){ // middle element is peak
                    return mid ; // found peak
                }else if(nums[mid]<nums[mid + 1]){ 
                    st = mid + 1 ;  // move to right side

                }else{
                    end = mid - 1 ; // move to left side

                }
            }

            return -1 ;
        }
    }
}