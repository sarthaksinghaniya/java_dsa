// Leetcode 33. Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {
        int st = 0 ;
        int end =  nums.length - 1 ; 
        while(st<=end){
            int mid = (st + end) / 2 ; //to avoid overflow use st + (end - st) / 2
            if(nums[mid] == target){
                return mid ;
            }else if(nums[st]<=nums[mid]){ //first part is sorted 
                
            if(target>=nums[st] && target<nums[mid]){ //in first part
                end = mid - 1 ; //move to left side

            }else{
                st = mid + 1 ; //move to right side
            }
            }else{ //second part is sorted
                if(target>=nums[mid] && target<= nums[end]){ //in second part
                    st = mid + 1 ; //move to right side

                }else{
                    end = mid - 1 ; //move to left side
                }

            }
        }

        return -1 ; //element not found
    }
}