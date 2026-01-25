class Solution {
    public void sortColors(int[] nums) { // Dutch National Flag Algorithm
         int low = 0 ; 
         int mid = 0 ;
         int high = nums.length - 1 ;

         while(mid<=high){ // Dutch National Flag Algorithm
            if(nums[mid]==0){
                swap(nums,low,mid) ; // swap 0 to the front
                low++ ;
                mid++ ;


            }else if(nums[mid] == 1){ // leave 1 in the middle
                mid++ ;
            }else{
                swap(nums,high,mid) ; // swap 2 to the end
                high-- ;
                
            }
         }

    }

    public void swap(int[] nums , int i , int j){ // swap function
        int k = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = k ;
    }
}