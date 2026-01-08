class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        int range = nums.length ;

        int as = (range*(range + 1))/2 ; //n(n+1)/2

        //actual sum h jb missing number present h 

        int cs  = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            cs = cs + nums[i] ;

        }
         
         int ans = as - cs ; 
         return ans ;
    }

}