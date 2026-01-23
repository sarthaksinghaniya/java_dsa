class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0 ;
        int end = nums.length - 1 ;
        while (st<= end ){
            int mid = (st + end)/2 ; 
            if(nums[mid] == target){
                return mid ; // found target

            }else if(target > nums[mid]){
                st = mid + 1 ;

            }else{
                end = mid - 1; 

            }
        }

        return st ; // target not found, return insert position
    }
}