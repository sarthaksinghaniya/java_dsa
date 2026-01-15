/* class Solution {
    public boolean increasingTriplet(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){

                    if(nums[i] < nums[j] && nums[j] < nums[k]){
                        return true ;
                    }
                }
            }
        }
        return false ;
    }
}
//bruteforce method O(n^3) time complexity
*/

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE ; // +infinity initially 
        int second = Integer.MAX_VALUE ; // +infinity initially 
        int third = Integer.MAX_VALUE ; // +infinity initially 

        for(int i = 0 ; i < nums.length ; i++){
            int ele = nums[i] ;

            if(first>=ele){
                first = ele ;

            }else if(second >= ele){
                second = ele ;

            }else{
                third = ele ;
                return true ;
            }
        }
        return false ;
    }
}
//optimal method O(n) time complexity and O(1) space complexity