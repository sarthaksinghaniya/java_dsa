// leetcode 540: Single Element in a Sorted Array
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0] ;

        }else if(nums[0] != nums[1]){
            return nums[0] ;

        }else if(nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1] ;
        }
        int st = 0 ;
        int end = nums.length - 1 ;

        while(st<= end){
            int mid = (st+ end ) / 2 ; 
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){ // found single element
                return nums[mid] ;

            }else if(mid % 2 == 1){ // if index is odd "mid"

                if(nums[mid-1] == nums[mid]){ // search in right
                    st = mid + 1 ;
                }else{
                    end = mid - 1;
                }
            }else{ // if index is even "mid"
                if(nums[mid] == nums[mid + 1]){ // search in right
                    st = mid + 1 ;
                }else{
                    end =mid - 1 ;
                }
            }
        }

        return -1 ;
    }
}