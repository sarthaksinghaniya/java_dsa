class Solution { 
    public int search(int[] nums, int target) {
        int st = 0 ; 
        int end = nums.length-1 ; // inclusive
        while (st<=end){ // when st==end , we still need to check that element
            int mid = (st + end)/2 ;  // to avoid overflow we can do st + (end - st)/2

            if(nums[mid]==target){
                return mid ; // found
            }else if(target > nums[mid]){ // go to right side
                st =mid + 1 ;
                
            }else{
                end = mid - 1 ; // go to left side
            }
        }
        return -1 ; // not found
    }
}
