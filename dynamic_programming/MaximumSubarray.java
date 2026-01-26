class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = nums[0] ;
        int max = nums[0] ;

        for(int i = 1 ; i <nums.length ; i++){ // iterate through the array
            if(currsum + nums[i]>nums[i]){ // extend the existing subarray
                currsum += nums[i] ; // extend the existing subarray

            }else{
                currsum = nums[i] ; // start a new subarray

            }
            max = Math.max(max , currsum) ; // update the maximum sum found so far

        }

        return max ;
    }
}